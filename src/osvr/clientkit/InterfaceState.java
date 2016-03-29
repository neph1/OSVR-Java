/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.clientkit;

import osvr.util.CPPObject;
import osvr.util.OSVR_Button;
import osvr.util.OSVR_Pose3;
import osvr.util.OSVR_Quaternion;
import osvr.util.OSVR_TimeValue;
import osvr.util.OSVR_Vec3;

/**
 *
 * @author Rickard
 */
public class InterfaceState{

    public InterfaceState(){
        initializeNative();
    }
    /**
     * Get Pose state from an interface, returning failure if none
     * @param iface
     * @param timestamp
     * @param state
     * @return 1 if pose was retrieved
     **/
    public native int osvrGetPoseState(long interfaceHandle, Interface iface, OSVR_TimeValue timestamp, OSVR_Pose3 state);

    /**
     *Get Position state from an interface, returning failure if none \ * exists.
     * @param iface
     * @param OSVR_TimeValue
     * @return 1 if position was retrieved
     */
    public native int osvrGetPositionState(long interfaceHandle, Interface iface, OSVR_TimeValue timestamp, OSVR_Vec3 state);
 	
 
    /**
     * 
     * @param interfaceHandle
     * @param iface
     * @param timestamp
     * @param state
     * @return 1 if position was retrieved
     */
    public native int osvrGetOrientationState (long interfaceHandle, Interface iface, OSVR_TimeValue timestamp, OSVR_Quaternion state);
    
    /**
     * Get Button state from an interface  
     * @param iface
     * @param OSVR_TimeValue
     * @return 
     */
    public native int osvrGetButtonState (long interfaceHandle, Interface iface, OSVR_TimeValue timestamp, OSVR_Button state);
    
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
