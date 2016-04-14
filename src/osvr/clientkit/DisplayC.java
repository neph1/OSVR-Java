/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.clientkit;

/**
 *
 * @author reden (neph1@github)
 */
public class DisplayC {
    
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
    
//    public native void osvrClientGetViewerEyeSurfaceRadialDistortion(OSVR_DisplayConfig displayConfig, int displayInput, )
    
//    public native boolean osvrClientGetViewerEyeSurfaceRadialDistortion
}


