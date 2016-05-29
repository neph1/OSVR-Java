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
public class OSVR_Vec3{
    
    private double[] data = new double[3];
    
    public OSVR_Vec3(){
        initializeNative();
    }
    
    public double[] getData() {
        return data;
    }

    public void setData(double[] data) {
        this.data = data;
    }
    
    public void setData(double x, double y, double z){
        data[0] = x;
        data[1] = y;
        data[2] = z;
    }
    
    public void set(OSVR_Vec3 vec){
        data[0] = vec.data[0];
        data[1] = vec.data[1];
        data[2] = vec.data[2];
    }
    
    public String toString(){
        return "OSVR_Vec3 x: " + data[0] + " y: " + data[1] + " z: " + data[2];
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
