/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.util;

/**
 *
 * @author Rickard
 */
public class OSVR_RadialDistortionParameters {
    private OSVR_Vec3 k1;
    private OSVR_Vec2 centerOfProjection;

    public OSVR_RadialDistortionParameters(){
        initializeNative();
        k1 = new OSVR_Vec3();
        centerOfProjection = new OSVR_Vec2();
    }
    
    public OSVR_Vec3 getK1() {
        return k1;
    }

    public void setK1(OSVR_Vec3 k1) {
        this.k1 = k1;
    }

    public OSVR_Vec2 getCenterOfProjection() {
        return centerOfProjection;
    }

    public void setCenterOfProjection(OSVR_Vec2 centerOfProjection) {
        this.centerOfProjection = centerOfProjection;
    }
    
    // NATIVE PART
    
    private long nativeHandle;
    private boolean disposed;

    public native void initializeNative();
    
    public native void disposeNative();
    
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
