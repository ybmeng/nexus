package com.nexus.payment;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;
import proto.nexus.payment.service.PaymentGrpc;

import com.nexus.payment.service.PaymentServiceModule;
import java.io.IOException;
import java.util.logging.Logger;

public class OnlinePaymentProcessorServer {
  private static final Logger logger = Logger.getLogger(OnlinePaymentProcessorServer.class.getName());
  private Server server;

  /**
   * Main launches the server from the command line.
   */
  public static void main(String[] args) throws IOException, InterruptedException {
    Injector injector = Guice.createInjector(
      new PaymentServiceModule(),
      new OnlinePaymentProcessorModule());

    OnlinePaymentProcessorServer server = injector.getInstance(OnlinePaymentProcessorServer.class);

    server.start();
    server.blockUntilShutdown();
  }

  BindableService paymentService;

  @Inject
  public OnlinePaymentProcessorServer(
    @Named(PaymentGrpc.SERVICE_NAME) BindableService paymentService) {
    this.paymentService = paymentService;
  }

  private void start() throws IOException {
    /* The port on which the server should run */
    int port = 50051;
    server = ServerBuilder.forPort(port)
      .addService(ProtoReflectionService.newInstance()) // For `bins/opt/grpc_cli ls [address]`
      .addService(paymentService)
      .build()
      .start();
    logger.info("Server started, listening on " + port);
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
        System.err.println("*** shutting down gRPC server since JVM is shutting down");
        OnlinePaymentProcessorServer.this.stop();
        System.err.println("*** server shut down");
      }
    });
  }

  private void stop() {
    if (server != null) {
      server.shutdown();
    }
  }

  /**
   * Await termination on the main thread since the grpc library uses daemon threads.
   */
  private void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      server.awaitTermination();
    }
  }

  public static class OnlinePaymentProcessorModule extends AbstractModule {
    @Override
    protected void configure() {
      bind(OnlinePaymentProcessorServer.class);
    }
  }
}
