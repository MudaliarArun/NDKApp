#include <jni.h>
JNIEXPORT jstring JNICALL
Java_com_test_ndkapp_MainActivity_getMsgFromJni(JNIEnv *env, jobject instance) {

   // TODO

   return (*env)->NewStringUTF(env, "Hey baby");
}