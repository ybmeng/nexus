package com.nexus.payment.service;

import com.google.inject.AbstractModule;
import com.google.inject.Binding;
import com.google.inject.Key;
import com.google.inject.name.Names;
import io.grpc.BindableService;
import proto.nexus.payment.service.PaymentGrpc;

public class PaymentServiceModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(BindableService.class).annotatedWith(
      Names.named(PaymentGrpc.SERVICE_NAME))
      .to(PaymentServiceImpl.class);
  }
}
