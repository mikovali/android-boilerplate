#include <jni.h>
#include "../cpp/testing-lib.cpp"

extern "C" {

JNIEXPORT void JNICALL
Java_io_github_mikovali_boilerplate_android_TestingLibBridge_testing(JNIEnv *env, jclass type) {
    testing();
}

}
