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
public class OSVR_Pose3{
    
    private OSVR_Vec3 translation = new OSVR_Vec3();
    private OSVR_Quaternion rotation = new OSVR_Quaternion();
    
    public OSVR_Pose3(){
        initializeNative();
        translation = new OSVR_Vec3();
        rotation = new OSVR_Quaternion();
    }
    
    public OSVR_Vec3 getTranslation() {
        return translation;
    }

    public void setTranslation(OSVR_Vec3 translation) {
        this.translation = translation;
    }

    public OSVR_Quaternion getRotation() {
        return rotation;
    }

    public void setRotation(OSVR_Quaternion rotation) {
        this.rotation = rotation;
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
