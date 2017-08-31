package com.nexus.service.inject;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class BindingAnnotations {
  @Retention(RetentionPolicy.RUNTIME)
  @BindingAnnotation
  public @interface GrpcService {}
}
