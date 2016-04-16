/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class osvr_clientkit_DisplayC */

#ifndef _Included_osvr_clientkit_DisplayC
#define _Included_osvr_clientkit_DisplayC
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     osvr_clientkit_DisplayC
 * Method:    setDisplayConfigNative
 * Signature: (Losvr/clientkit/OSVR_DisplayConfig;)V
 */
JNIEXPORT void JNICALL Java_osvr_clientkit_DisplayC_setDisplayConfigNative
  (JNIEnv *, jobject, jobject);

/*
 * Class:     osvr_clientkit_DisplayC
 * Method:    dispose
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_osvr_clientkit_DisplayC_dispose
  (JNIEnv *, jobject);

/*
 * Class:     osvr_clientkit_DisplayC
 * Method:    osvrClientGetNumDisplayInputs
 * Signature: (Losvr/clientkit/OSVR_DisplayConfig;)I
 */
JNIEXPORT jint JNICALL Java_osvr_clientkit_DisplayC_osvrClientGetNumDisplayInputs
  (JNIEnv *, jobject, jobject);

/*
 * Class:     osvr_clientkit_DisplayC
 * Method:    osvrClientGetNumViewers
 * Signature: (Losvr/clientkit/OSVR_DisplayConfig;)I
 */
JNIEXPORT jint JNICALL Java_osvr_clientkit_DisplayC_osvrClientGetNumViewers
  (JNIEnv *, jobject, jobject);

/*
 * Class:     osvr_clientkit_DisplayC
 * Method:    osvrClientGetNumEyesForViewer
 * Signature: (Losvr/clientkit/OSVR_DisplayConfig;I)I
 */
JNIEXPORT jint JNICALL Java_osvr_clientkit_DisplayC_osvrClientGetNumEyesForViewer
  (JNIEnv *, jobject, jobject, jint);

/*
 * Class:     osvr_clientkit_DisplayC
 * Method:    osvrClientGetNumSurfacesForViewerEye
 * Signature: (Losvr/clientkit/OSVR_DisplayConfig;II)I
 */
JNIEXPORT jint JNICALL Java_osvr_clientkit_DisplayC_osvrClientGetNumSurfacesForViewerEye
  (JNIEnv *, jobject, jobject, jint, jint);

/*
 * Class:     osvr_clientkit_DisplayC
 * Method:    osvrClientGetRelativeViewportForViewerEyeSurface
 * Signature: (Losvr/clientkit/OSVR_DisplayConfig;III[I)V
 */
JNIEXPORT void JNICALL Java_osvr_clientkit_DisplayC_osvrClientGetRelativeViewportForViewerEyeSurface
  (JNIEnv *, jobject, jobject, jint, jint, jint, jintArray);

/*
 * Class:     osvr_clientkit_DisplayC
 * Method:    osvrClientGetViewerEyeSurfaceProjectionMatrixf
 * Signature: (Losvr/clientkit/OSVR_DisplayConfig;IIIFFI[F)V
 */
JNIEXPORT void JNICALL Java_osvr_clientkit_DisplayC_osvrClientGetViewerEyeSurfaceProjectionMatrixf
  (JNIEnv *, jobject, jobject, jint, jint, jint, jfloat, jfloat, jint, jfloatArray);

/*
 * Class:     osvr_clientkit_DisplayC
 * Method:    osvrClientGetViewerEyeViewMatrixf
 * Signature: (Losvr/clientkit/OSVR_DisplayConfig;III[F)V
 */
JNIEXPORT void JNICALL Java_osvr_clientkit_DisplayC_osvrClientGetViewerEyeViewMatrixf
  (JNIEnv *, jobject, jobject, jint, jint, jint, jfloatArray);

/*
 * Class:     osvr_clientkit_DisplayC
 * Method:    osvrClientGetViewerEyeSurfaceDisplayInputIndex
 * Signature: (Losvr/clientkit/OSVR_DisplayConfig;III)I
 */
JNIEXPORT jint JNICALL Java_osvr_clientkit_DisplayC_osvrClientGetViewerEyeSurfaceDisplayInputIndex
  (JNIEnv *, jobject, jobject, jint, jint, jint);

/*
 * Class:     osvr_clientkit_DisplayC
 * Method:    osvrClientGetViewerEyeSurfaceProjectionClippingPlanes
 * Signature: (Losvr/clientkit/OSVR_DisplayConfig;III[D)V
 */
JNIEXPORT void JNICALL Java_osvr_clientkit_DisplayC_osvrClientGetViewerEyeSurfaceProjectionClippingPlanes
  (JNIEnv *, jobject, jobject, jint, jint, jint, jdoubleArray);

/*
 * Class:     osvr_clientkit_DisplayC
 * Method:    osvrClientDoesViewerEyeSurfaceWantDistortion
 * Signature: (Losvr/clientkit/OSVR_DisplayConfig;III)Z
 */
JNIEXPORT jboolean JNICALL Java_osvr_clientkit_DisplayC_osvrClientDoesViewerEyeSurfaceWantDistortion
  (JNIEnv *, jobject, jobject, jint, jint, jint);

/*
 * Class:     osvr_clientkit_DisplayC
 * Method:    osvrClientGetViewerEyeSurfaceRadialDistortionPriority
 * Signature: (Losvr/clientkit/OSVR_DisplayConfig;III)I
 */
JNIEXPORT jint JNICALL Java_osvr_clientkit_DisplayC_osvrClientGetViewerEyeSurfaceRadialDistortionPriority
  (JNIEnv *, jobject, jobject, jint, jint, jint);

/*
 * Class:     osvr_clientkit_DisplayC
 * Method:    osvrClientGetViewerEyeSurfaceRadialDistortion
 * Signature: (Losvr/clientkit/OSVR_DisplayConfig;IIILosvr/util/OSVR_RadialDistortionParameters;)V
 */
JNIEXPORT void JNICALL Java_osvr_clientkit_DisplayC_osvrClientGetViewerEyeSurfaceRadialDistortion
  (JNIEnv *, jobject, jobject, jint, jint, jint, jobject);

/*
 * Class:     osvr_clientkit_DisplayC
 * Method:    releaseFloatArray
 * Signature: ([F)V
 */
JNIEXPORT void JNICALL Java_osvr_clientkit_DisplayC_releaseFloatArray
  (JNIEnv *, jobject, jfloatArray);

/*
 * Class:     osvr_clientkit_DisplayC
 * Method:    releaseIntArray
 * Signature: ([I)V
 */
JNIEXPORT void JNICALL Java_osvr_clientkit_DisplayC_releaseIntArray
  (JNIEnv *, jobject, jintArray);

/*
 * Class:     osvr_clientkit_DisplayC
 * Method:    releaseDoubleArray
 * Signature: ([D)V
 */
JNIEXPORT void JNICALL Java_osvr_clientkit_DisplayC_releaseDoubleArray
  (JNIEnv *, jobject, jdoubleArray);

#ifdef __cplusplus
}
#endif
#endif