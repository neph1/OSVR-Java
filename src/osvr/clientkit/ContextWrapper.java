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
public class ContextWrapper {
    
    private long nativeHandle;
    private boolean disposed;
    
    public ContextWrapper(){
    }
    
    public native long initializeNative(String contextName);
    
    public native void updateNative();
    
    public native String getStringParameter(String path);
    
    public native boolean checkStatus();
    
    public native long getInterface(String name, Interface holder);
    
    // public native void free(String name);
    
    // public native OSVR_ClientContext get();
    
    public native void dispose();

    public void initialize(String contextName){
        long handle = initializeNative(contextName);
        //nativeHandle = handle;
    }
    
    @Override
    protected void finalize() throws Throwable {
        if(!disposed){
            dispose();
            disposed = true;
        }
        super.finalize();
    }
    
    
    public void update(){
        updateNative();
    }
    
    public long getNativeHandle(){
        return nativeHandle;
    }
    
    public void setNativeHandle(long handle){
        this.nativeHandle = handle;
    }
    
}
