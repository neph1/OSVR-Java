/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.clientkit;

import osvr.util.CPPObject;
import osvr.util.callback.OSVR_Callback;
import osvr.util.callback.OSVR_PoseCallback;

/**
 *
 * @author Rickard
 */
public class Interface{
    
    private ContextWrapper context;
    
    public Interface(){
        initializeNative();
    }
    
    public native void registerCallback(OSVR_Callback callback, int type, String userData);
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
