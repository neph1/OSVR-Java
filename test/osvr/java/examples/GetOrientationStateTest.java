/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.java.examples;

import osvr.clientkit.ContextWrapper;
import osvr.clientkit.Interface;
import osvr.clientkit.InterfaceState;
import osvr.java.util.LibraryLoader;
import osvr.util.OSVR_Pose3;
import osvr.util.OSVR_Quaternion;
import osvr.util.OSVR_TimeValue;
import osvr.util.OSVR_Vec3;

/**
 *
 * @author Rickard
 */
public class GetOrientationStateTest {
    
    
    public static void main(String[] args){
        LibraryLoader.loadLibraries();
        
        ContextWrapper context = new ContextWrapper();
        context.initialize("InterfaceTest");
        Interface iface;
        InterfaceState ifaceState;
        try{
            iface = new Interface();
            context.getInterface("/me/head", iface);
            //iface.setNativeHandle(handle);
            
            ifaceState = new InterfaceState();
            OSVR_TimeValue timeValue = new OSVR_TimeValue();
            OSVR_Quaternion orientation = new OSVR_Quaternion();
            context.update();
            int result = ifaceState.osvrGetOrientationState(iface.getNativeHandle(), iface, timeValue, orientation);
            System.out.println("result: " + result);
            System.out.println("pose vec: " + orientation.toString());
        } catch(Exception e){
            e.printStackTrace();
        }
        boolean status = context.checkStatus();
        System.out.println("status: " + status);
        context.dispose();
        
    }
    
    
}
