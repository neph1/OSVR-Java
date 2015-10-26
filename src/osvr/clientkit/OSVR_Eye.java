/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.clientkit;

import java.util.ArrayList;
import java.util.List;
import osvr.util.OSVR_Pose3;

/**
 *
 * @author Rickard
 */
public class OSVR_Eye {
    
    private List<OSVR_Surface> surfaces;
    
    public native int getNumSurfaces();
    
    public native OSVR_Surface getSurface(int surface, OSVR_Surface holder);
    
    public native boolean getPose(OSVR_Pose3 pose);
    
    public native boolean getViewMatrix(int flags, float[][] viewMatrix);
    
    public void setupEye(){
        surfaces = new ArrayList<OSVR_Surface>();
        int numSurfaces = getNumSurfaces();
        System.out.println("Found number of eyes " + numSurfaces);
        for(int i = 0; i < numSurfaces; i++){
            OSVR_Surface surface = getSurface(i, null);
            //surface.setupEye();
            surfaces.add(surface);
        }
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
