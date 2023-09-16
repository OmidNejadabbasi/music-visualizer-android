#include <jni.h>
#include <string>
#include <projectM/presets.h>
#include <projectM/renderer.h>

extern "C" JNIEXPORT jstring

JNICALL
Java_com_omid_musicvisualizer_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    projectM::Context* context = projectM::initContext();
    return env->NewStringUTF(hello.c_str());
}