/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.clientkit;

import osvr.util.callback.OSVR_Callback;
import osvr.util.callback.OSVR_PoseCallback;

/**
 *
 * @author Rickard
 */
public class Interface {
    
    private long nativeHandle;
    
    private ContextWrapper context;
    
    public Interface(){
        initializeNative();
    }
    
    public native long initializeNative();
    
    public native void freeNative();
    //public native void registerCallback(OSVR_Callback callback, String userData);
    
    public native void registerCallback(OSVR_Callback callback, int type, String userData);

    public long getNativeHandle() {
        return nativeHandle;
    }

    public void setNativeHandle(long nativeHandle) {
        this.nativeHandle = nativeHandle;
    }
    
    
}
