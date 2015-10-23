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
import osvr.util.OSVR_TimeValue;
import osvr.util.OSVR_Vec3;

/**
 *
 * @author Rickard
 */
public class GetPoseStateTest {
    
    
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
            System.out.println("Interface " + iface.getNativeHandle());
            
            ifaceState = new InterfaceState();
            System.out.println("InterfaceState " + iface.getNativeHandle());
            OSVR_TimeValue timeValue = new OSVR_TimeValue();
            OSVR_Pose3 pose = new OSVR_Pose3();
            int result = ifaceState.osvrGetPoseState(iface, timeValue, pose);
            System.out.println("result: " + result);
            System.out.println("pose vec: " + pose.getTranslation().toString());
        } catch(Exception e){
            e.printStackTrace();
        }
        boolean status = context.checkStatus();
        System.out.println("status: " + status);
        context.dispose();
        
    }
    
    
}
