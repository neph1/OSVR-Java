/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.clientkit;

/**
 *
 * @author Rickard
 */
public class DisplayWrapper {
    
    
    
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
