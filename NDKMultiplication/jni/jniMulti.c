#include <jni.h>
#include <stdio.h>
/*
 * the function name should be always Java_packageName_ActivityName_FunctionName
 */
JNIEXPORT jint JNICALL Java_com_vm_ndkmultiplication_MainActivity_multiply(
		JNIEnv *env, jobject thisObj, jint n1, jint n2) {
	jint result;
	result = n1 * n2;
	return result;
}
