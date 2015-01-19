LOCAL_PATH := $(call my-dir)
 
include $(CLEAR_VARS)
 
# Here we give our module name and source file(s)
LOCAL_MODULE    := jniMulti
LOCAL_SRC_FILES := jniMulti.c
 
include $(BUILD_SHARED_LIBRARY)