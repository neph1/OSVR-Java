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
public class DisplayHelper {
    
    
    private OSVR_DisplayConfig display;
    private OSVR_Viewer viewer;
    
    // NATIVE PART
    
    private long nativeHandle;
    private boolean disposed;
    
    public DisplayHelper(OSVR_DisplayConfig display, OSVR_Viewer viewer){
        initializeNative();
        this.display = display;
        this.viewer = viewer;
    }

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
    
    public boolean getViewMatrix(OSVR_Eye eye, float[] viewMatrix){
        if(viewMatrix == null){
            viewMatrix = new float[16];
        }
        return getViewMatrix(display.getNativeHandle(), viewer.getID(), eye.getID(), viewMatrix);
    }
    
    public native boolean getViewMatrix(long display, long viewer, int eye, float[] viewMatrix);
}
