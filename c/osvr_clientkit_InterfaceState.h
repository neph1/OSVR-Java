/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class osvr_clientkit_InterfaceState */

#ifndef _Included_osvr_clientkit_InterfaceState
#define _Included_osvr_clientkit_InterfaceState
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     osvr_clientkit_InterfaceState
 * Method:    initializeNative
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_osvr_clientkit_InterfaceState_initializeNative
  (JNIEnv *, jobject);

/*
 * Class:     osvr_clientkit_InterfaceState
 * Method:    osvrGetPoseState
 * Signature: (Losvr/clientkit/Interface;Losvr/util/OSVR_TimeValue;Losvr/util/OSVR_Pose3;)I
 */
JNIEXPORT jint JNICALL Java_osvr_clientkit_InterfaceState_osvrGetPoseState
  (JNIEnv *, jobject, jobject, jobject, jobject);

/*
 * Class:     osvr_clientkit_InterfaceState
 * Method:    osvrGetPositionState
 * Signature: (Losvr/clientkit/Interface;Losvr/util/OSVR_TimeValue;Losvr/util/OSVR_Vec3;)I
 */
JNIEXPORT jint JNICALL Java_osvr_clientkit_InterfaceState_osvrGetPositionState
  (JNIEnv *, jobject, jobject, jobject, jobject);

#ifdef __cplusplus
}
#endif
#endif