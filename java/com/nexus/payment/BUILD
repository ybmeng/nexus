java_binary(
    name = "paymentserver",
    srcs = [
        "OnlinePaymentProcessorServer.java",
    ],
    main_class = "com.nexus.payment.OnlinePaymentProcessorServer",
    runtime_deps = [
        "@org_pubref_rules_protobuf//java:netty_runtime_deps",
    ],
    deps = [
        "//java/com/nexus/payment/service",
        "//proto/nexus/payment/service",
        "@aopalliance_aopalliance//jar",
        "@com_google_inject_guice//jar",
        "@io_grpc_grpc_services//jar",
        "@javax_inject_javax_inject//jar",
        "@org_pubref_rules_protobuf//java:grpc_compiletime_deps",
    ],
)
