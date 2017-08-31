
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
  artifact = "com.google.guava:guava:19.0",
  sha1 = "6ce200f6b23222af3d8abb6b6459e6c44f4bb0e9",
)

# Guice: Dependency injection framework.
# deps = ["@com_google_inject_guice//jar",]
maven_jar(
  name = "com_google_inject_guice",
  artifact = "com.google.inject:guice:4.1.0",
  sha1 = "eeb69005da379a10071aa4948c48d89250febb07",
)

# deps = ["@javax_inject_javax_inject//jar",]
maven_jar(
    name = "javax_inject_javax_inject",
  artifact = "javax.inject:javax.inject:1",
  sha1 = "6975da39a7040257bd51d21a231b76c915872d38",
)

# deps = ["@aopalliance_aopalliance//jar",]
maven_jar(
    name = "aopalliance_aopalliance",
  artifact = "aopalliance:aopalliance:1.0",
  sha1 = "0235ba8b489512805ac13a8f9ea77a1ca5ebe3e8",
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
# gRPC: An RPC library and framework.
# deps = ["@io_grpc_grpc_netty//jar",]
maven_jar(
  name = "io_grpc_grpc_services",
  artifact = "io.grpc:grpc-services:1.4.0",
  sha1 = "2e8042663739fd13e916ce06ec601d14004c4cba",
)

###
# Building grpc services:
###
# deps = ["@org_pubref_rules_protobuf//jar",]
#new_http_archive(
#  name = "org_pubref_rules_protobuf",
#  url = "https://api.github.com/repos/pubref/rules_protobuf/tarball/525f0613d3e29fa1d37119a7099dcff69014ca84",
#  sha256 = "adb393b8ec70dd07277d620570839bb74cedb7cb3faea5cb5245332dde47c0f8"
#)

#load("@org_pubref_rules_protobuf//java:rules.bzl", "java_proto_repositories")
#java_proto_repositories()

git_repository(
  name = "org_pubref_rules_protobuf",
  remote = "https://github.com/pubref/rules_protobuf",
  commit = "525f0613d3e29fa1d37119a7099dcff69014ca84" # or choose latest commit on master
)

load("@org_pubref_rules_protobuf//java:rules.bzl", "java_proto_repositories")
java_proto_repositories()
