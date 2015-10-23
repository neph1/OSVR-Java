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
public class OSVR_TimeValue{
    
    private long seconds;
    private int milliSeconds;
    
    public OSVR_TimeValue(){
        initializeNative();
    }
  
    public long getSeconds() {
        return seconds;
    }

    public void setSeconds(long seconds) {
        this.seconds = seconds;
    }

    public int getMilliSeconds() {
        return milliSeconds;
    }

    public void setMilliSeconds(int milliSeconds) {
        this.milliSeconds = milliSeconds;
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
