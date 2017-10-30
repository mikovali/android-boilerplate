#include "android/log.h"

void testing() {
    __android_log_print(ANDROID_LOG_ERROR, "NDK", "This is working");
}
