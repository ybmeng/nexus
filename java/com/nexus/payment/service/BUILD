package(default_visibility = [
    "//java/com/nexus:__subpackages__",
])

java_library(
    name = "service",
    srcs = glob(["*.java"]),
    deps = [
        "//proto/nexus/payment/service",
        "@com_google_inject_guice//jar",
    ],
)
