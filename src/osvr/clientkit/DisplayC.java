/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.clientkit;

import osvr.util.OSVR_RadialDistortionParameters;

/**
 *
 * @author reden (neph1@github)
 */
public class DisplayC {
    
    private OSVR_DisplayConfig displayConfig;
    
    public int osvrClientGetNumDisplayInputs(){
        return osvrClientGetNumDisplayInputs(displayConfig);
    }
    
    public int osvrClientGetNumViewers(){
        return osvrClientGetNumViewers(displayConfig);
    }
    
    public int osvrClientGetNumEyesForViewer(int viewer){
        return osvrClientGetNumEyesForViewer(displayConfig, viewer);
    }
    
    public int osvrClientGetNumSurfacesForViewerEye(int viewer, int eye){
        return osvrClientGetNumSurfacesForViewerEye(displayConfig, viewer, eye);
    }
    
    public void osvrClientGetRelativeViewportForViewerEyeSurface(int viewer, int eye, int surface, int[] viewport){
        osvrClientGetRelativeViewportForViewerEyeSurface(displayConfig, viewer, eye, surface, viewport);
    }
    
    public void osvrClientGetViewerEyeSurfaceProjectionMatrixf(int viewer, int eye, int surface, float near, float far, int flags, float[] projectionMatrix){
        osvrClientGetViewerEyeSurfaceProjectionMatrixf(displayConfig, viewer, eye, surface, near, far, flags, projectionMatrix);
    }
    
    public void osvrClientGetViewerEyeViewMatrixf(int viewer, int eye, int flags, float[] viewMatrix){
        osvrClientGetViewerEyeViewMatrixf(displayConfig, viewer, eye, flags, viewMatrix);
    }
    
    public void osvrClientGetViewerEyeSurfaceRadialDistortion(int viewer, int eye, int surface, OSVR_RadialDistortionParameters params){
        osvrClientGetViewerEyeSurfaceRadialDistortion(displayConfig, viewer, eye, surface, params);
    }
    
    public void setDisplayConfig(OSVR_DisplayConfig config){
        displayConfig = config;
    }
    
    public native void setDisplayConfigNative(OSVR_DisplayConfig displayConfig);
    
    public native void dispose();
    
    public native int osvrClientGetNumDisplayInputs(OSVR_DisplayConfig displayConfig);
    
    public native int osvrClientGetNumViewers(OSVR_DisplayConfig displayConfig);
    
    public native int osvrClientGetNumEyesForViewer(OSVR_DisplayConfig displayConfig, int viewer);
    
    public native int osvrClientGetNumSurfacesForViewerEye(OSVR_DisplayConfig displayConfig, int viewer, int eye);
    
    public native void osvrClientGetRelativeViewportForViewerEyeSurface(OSVR_DisplayConfig displayConfig, int viewer, int eye, int surface, int[] viewport);
    
    public native void osvrClientGetViewerEyeSurfaceProjectionMatrixf(OSVR_DisplayConfig displayConfig, int viewer, int eye, int surface, float near, float far, int flags, float[] projectionMatrix);
    
    public native void osvrClientGetViewerEyeViewMatrixf(OSVR_DisplayConfig displayConfig, int viewer, int eye, int flags, float[] viewMatrix);
    
    public native int osvrClientGetViewerEyeSurfaceDisplayInputIndex(OSVR_DisplayConfig displayConfig, int viewer, int eye, int surface);
    
    public native void osvrClientGetViewerEyeSurfaceProjectionClippingPlanes(OSVR_DisplayConfig displayConfig, int viewer, int eye, int surface, double[] planes);
    
    public native boolean osvrClientDoesViewerEyeSurfaceWantDistortion(OSVR_DisplayConfig displayConfig, int viewer, int eye, int surface);
    
    public native int osvrClientGetViewerEyeSurfaceRadialDistortionPriority(OSVR_DisplayConfig displayConfig, int viewer, int eye, int surface);
    
    public native void osvrClientGetViewerEyeSurfaceRadialDistortion(OSVR_DisplayConfig displayConfig, int viewer, int eye, int surface, OSVR_RadialDistortionParameters params );
    
    public native void releaseFloatArray(float[] floatArray);
    
    public native void releaseIntArray(int[] intArray);
    
    public native void releaseDoubleArray(double[] doubleArray);
    
//    public native boolean osvrClientGetViewerEyeSurfaceRadialDistortion
}


