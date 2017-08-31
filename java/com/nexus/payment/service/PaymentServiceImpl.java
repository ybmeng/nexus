package com.nexus.payment.service;

import com.google.inject.Inject;
import io.grpc.stub.StreamObserver;
import proto.nexus.payment.service.PaymentGrpc.PaymentImplBase;
import proto.nexus.payment.service.PaymentOuterClass.InitializePaymentRequest;
import proto.nexus.payment.service.PaymentOuterClass.InitializePaymentResponse;

import java.util.Random;

public class PaymentServiceImpl extends PaymentImplBase {

  @Inject
  public PaymentServiceImpl() {}

  @Override
  public void initializePayment(
    InitializePaymentRequest request, StreamObserver<InitializePaymentResponse> responseStreamObserver) {
    System.out.println(String.format("Processing payment with instrument type %s",
      request.getInstrument().getInstrumentType().toString()));

    responseStreamObserver.onNext(
      InitializePaymentResponse.newBuilder().setPaymentId(
        request.getInstrument().getInstrumentType().toString() + ":" + getRandomString(32)
      ).build()
    );

  }

  public String getRandomString(int length) {
    return new Random().ints(48,122)
      .filter(i-> (i<57 || i>65) && (i <90 || i>97))
      .mapToObj(i -> (char) i)
      .limit(length)
      .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
      .toString();
  }

}
