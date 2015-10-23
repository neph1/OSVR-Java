/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.clientkit;

import osvr.util.OSVR_Pose3;
import osvr.util.OSVR_TimeValue;
import osvr.util.OSVR_Vec3;

/**
 *
 * @author Rickard
 */
public class InterfaceState {

    private long nativeHandle;
    private boolean disposed;
    
    public InterfaceState(){
        initializeNative();
    }
    public native void initializeNative();
    
    /**
     * Get Pose state from an interface, returning failure if none \ * exists.
     */

    public native int osvrGetPoseState(Interface iface, OSVR_TimeValue timestamp, OSVR_Pose3 state);

    /**
     *Get Position state from an interface, returning failure if none \ * exists.
     * @param iface
     * @param OSVR_TimeValue
     * @return
     */
    public native int osvrGetPositionState(Interface iface, OSVR_TimeValue timestamp, OSVR_Vec3 state);
 	
 
    //public native int osvrGetOrientationState (Interface iface, OSVR_TimeValue timestamp, OSVR_OrientationState *state)
// 	Get Orientation state from an interface  
//
//            , returning failure if none \ * exists.
// 
//OSVR_ReturnCode 	osvrGetButtonState (OSVR_ClientInterface iface, struct OSVR_TimeValue *timestamp, OSVR_ButtonState *state)
// 	Get Button state from an interface  
//
//                , returning failure if none \ * exists.
// 
//OSVR_ReturnCode 	osvrGetAnalogState (OSVR_ClientInterface iface, struct OSVR_TimeValue *timestamp, OSVR_AnalogState *state)
// 	Get Analog state from an interface  
//
//                    , returning failure if none \ * exists.
// 
//OSVR_ReturnCode 	osvrGetLocation2DState (OSVR_ClientInterface iface, struct OSVR_TimeValue *timestamp, OSVR_Location2DState *state)
// 	Get Location2D state from an interface  
//
//                        , returning failure if none \ * exists.
// 
//OSVR_ReturnCode 	osvrGetDirectionState (OSVR_ClientInterface iface, struct OSVR_TimeValue *timestamp, OSVR_DirectionState *state)
// 	Get Direction state from an interface  
//
//                            , returning failure if none \ * exists.
// 
//OSVR_ReturnCode 	osvrGetEyeTracker2DState (OSVR_ClientInterface iface, struct OSVR_TimeValue *timestamp, OSVR_EyeTracker2DState *state)
// 	Get EyeTracker2D state from an interface  
//
//                                , returning failure if none \ * exists.
// 
//OSVR_ReturnCode 	osvrGetEyeTracker3DState (OSVR_ClientInterface iface, struct OSVR_TimeValue *timestamp, OSVR_EyeTracker3DState *state)
// 	Get EyeTracker3D state from an interface  
//
//                                    , returning failure if none \ * exists.
// 
//OSVR_ReturnCode 	osvrGetEyeTrackerBlinkState (OSVR_ClientInterface iface, struct OSVR_TimeValue *timestamp, OSVR_EyeTrackerBlinkState *state)
// 	Get EyeTrackerBlink state from an interface  
//
//                                        , returning failure if none \ * exists.
// 
//OSVR_ReturnCode 	osvrGetNaviVelocityState (OSVR_ClientInterface iface, struct OSVR_TimeValue *timestamp, OSVR_NaviVelocityState *state)
// 	Get NaviVelocity state from an interface  , returning failure if none \ * exists.
// 
//OSVR_ReturnCode 	osvrGetNaviPositionState (OSVR_ClientInterface iface, struct OSVR_TimeValue *timestamp, OSVR_NaviPositionState *state)

    public long getNativeHandle() {
        return nativeHandle;
    }

    public void setNativeHandle(long nativeHandle) {
        this.nativeHandle = nativeHandle;
    }
    
    public native void disposeNative();
    
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
