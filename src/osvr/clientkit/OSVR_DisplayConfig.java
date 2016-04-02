/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.clientkit;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rickard
 */
public class OSVR_DisplayConfig {
    
    private final ContextWrapper context;
    private List<OSVR_Viewer> viewers;
    
    public OSVR_DisplayConfig(ContextWrapper context){
        this.context = context;
        initializeNative(context);
    }
    
    public void setupDisplay(){
        viewers = new ArrayList<OSVR_Viewer>();
        int numViewers  = getNumViewers();
        System.out.println("FOund viewers: " + numViewers);
        for(int i = 0; i < 1; i++){
            OSVR_Viewer viewer = new OSVR_Viewer();
            getViewer(i, viewer);
            System.out.println("Viewer " + viewer.getNativeHandle());
            viewer.setupViewer();
            viewers.add(viewer);
        }
    }
    
    public native boolean valid();
    
    public native boolean checkStartup();
    
    public native int getNumDisplayInputs();
    
    public native int getNumViewers();
    
    public native OSVR_Viewer getViewer(int viewer, OSVR_Viewer holder);
    
    public native OSVR_Eye getEye(long viewer, int eye, OSVR_Eye holder);
    
    public native OSVR_Surface getSurface(int viewer, int eye, int surface, OSVR_Surface holder);

    // NATIVE PART
    
    private long nativeHandle;
    private boolean disposed;

//    public native void initializeNative(long contextHandle);
    
    public native void initializeNative(ContextWrapper context);
    
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
