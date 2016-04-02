/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.clientkit;

import osvr.util.OSVR_RadialDistortionParameters;

/**
 *
 * @author Rickard
 */
public class OSVR_Surface {
    
    public native RelativeViewport getRelativeViewport();
    
    public native void getProjectionMatrix(float near, float far, int flags, float[][] projectionMatrix);
    
//    public native ProjectionClippingPlanes getProjectionClippingPlanes();
    
    public native boolean isDistortionRequested();
    
//    public native OSVR_DistortionPriority getRadialDistortionPriorit();
    
    public native OSVR_RadialDistortionParameters getRadialDistortion();
    
    // NATIVE PART
    
    private long nativeHandle;
    private boolean disposed;

    public native void initializeNative();
    
    public native void disposeNative();
    
    public native int getSurfaceID();
    
    public long getNativeHandle() {
        return nativeHandle;
    }

    public void setNativeHandle(long nativeHandle) {
        this.nativeHandle = nativeHandle;
    }
    
    public void dispose(){
        disposed = true;
        disposeNative();
    }

    @Override
    protected void finalize() throws Throwable {
        if(!disposed){
            dispose();
        }
        super.finalize();
    }
}
