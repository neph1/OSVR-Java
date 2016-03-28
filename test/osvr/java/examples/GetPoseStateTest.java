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
        Interface iface = new Interface();
        InterfaceState ifaceState;
        try{
            long handle = context.getInterface("/me/head", iface);
//            iface[0].setNativeHandle(handle);
            Thread.sleep(2000);
            ifaceState = new InterfaceState();
            
            OSVR_TimeValue timeValue = new OSVR_TimeValue();
            OSVR_Pose3 pose = new OSVR_Pose3();
            int i = 0;
            while(i++ < 20){
                context.update();
                timeValue.setMilliSeconds((int)System.currentTimeMillis());
                int result = ifaceState.osvrGetPoseState(iface.getNativeHandle(), iface, timeValue, pose);
                if(result > 0){
                    System.out.println("pose vec /me/head: " + pose.getTranslation().toString() + " "  + pose.getRotation().toString());
                } else {
                    System.out.println("pose vec /me/head: not valid");
                }
                
                Thread.sleep(400);
            }
            
        } catch(Exception e){
            e.printStackTrace();
        }
        boolean status = context.checkStatus();
        System.out.println("status: " + status);
        context.dispose();
        
    }
    
    
}
