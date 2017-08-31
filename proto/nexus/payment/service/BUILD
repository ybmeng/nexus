load("@org_pubref_rules_protobuf//java:rules.bzl", "java_proto_library")

package(default_visibility = [
    "//java/com/nexus:__subpackages__",
])

java_proto_library(
    name = "service",
    protos = [
        "payment.proto",
    ],
    verbose = 1,  # 0=no output, 1=show protoc command, 2+ more...
    with_grpc = True,
)
