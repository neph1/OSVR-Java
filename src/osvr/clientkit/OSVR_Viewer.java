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
public class OSVR_Viewer {
    
    public OSVR_Viewer(){
        initializeNative();
    }
    private List<OSVR_Eye> eyes;
    
    public native int getNumEyes();
    
    public native OSVR_Eye getEye(int eye, OSVR_Eye holder);
    
    public native OSVR_Surface getSurface(int surface, OSVR_Surface holder);
    
    public native boolean getPose(OSVR_Pose3 pose);
    
    public void setupViewer(){
        eyes = new ArrayList<OSVR_Eye>();
        int numEyes = getNumEyes();
        System.out.println("Found number of eyes " + numEyes);
        for(int i = 0; i < numEyes; i++){
            OSVR_Eye eye = getEye(i, null);
            eye.setupEye();
            eyes.add(eye);
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
