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
public class OSVR_Quaternion{

    private double[] data = new double[4];
    
    public OSVR_Quaternion(){
        initializeNative();
    }
    
    public double[] getData() {
        return data;
    }

    public void setData(double[] data) {
        this.data = data;
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
    
    public String toString(){
        return "w:" + data[0] + " x:" + data[1] + " y:" + data[2] + " z:" + data[3];
    }
}
