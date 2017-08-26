
# Protocol Buffers: Data interchange format.
# proto_library rules implicitly depend on @com_google_protobuf//:protoc,
http_archive(
    name = "com_google_protobuf",
    strip_prefix = "protobuf-b4b0e304be5a68de3d0ee1af9b286f958750f5e4",
    urls = ["https://github.com/google/protobuf/archive/b4b0e304be5a68de3d0ee1af9b286f958750f5e4.zip"],
)
# java_proto_library rules implicitly depend on @com_google_protobuf_java//:java_toolchain,
http_archive(
    name = "com_google_protobuf_java",
    strip_prefix = "protobuf-b4b0e304be5a68de3d0ee1af9b286f958750f5e4",
    urls = ["https://github.com/google/protobuf/archive/b4b0e304be5a68de3d0ee1af9b286f958750f5e4.zip"],
)

# Guava: Google java libraries.
# deps = ["@com_google_guava_guava//jar",]
maven_jar(
    name = "com_google_guava_guava",
    artifact = "com.google.guava:guava:23.0",
    sha1 = "c947004bb13d18182be60077ade044099e4f26f1",
)

# Guice: Dependency injection framework.
# deps = ["@com_google_inject_guice//jar",]
maven_jar(
    name = "com_google_inject_guice",
    artifact = "com.google.inject:guice:4.1.0",
    sha1 = "eeb69005da379a10071aa4948c48d89250febb07",
)

# gRPC: An RPC library and framework.
# deps = ["@io_grpc_grpc_netty//jar",]
maven_jar(
    name = "io_grpc_grpc_netty",
    artifact = "io.grpc:grpc-netty:1.4.0",
    sha1 = "4c463ab9f4487e11417ea15187813d082eab02ea",
)
# deps = ["@io_grpc_grpc_protobuf//jar",]
maven_jar(
    name = "io_grpc_grpc_protobuf",
    artifact = "io.grpc:grpc-protobuf:1.4.0",
    sha1 = "8f99da3d840cb96cd655d610f771aeca4561d52d",
)
# deps = ["@io_grpc_grpc_stub//jar",]
maven_jar(
    name = "io_grpc_grpc_stub",
    artifact = "io.grpc:grpc-stub:1.4.0",
    sha1 = "840a1a94c9f6a91511644fed6b1116914acfdb90",
)
