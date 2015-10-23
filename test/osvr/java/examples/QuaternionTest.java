/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.java.examples;

import osvr.clientkit.ContextWrapper;
import osvr.java.util.LibraryLoader;
import osvr.util.OSVR_Pose3;
import osvr.util.OSVR_Quaternion;
import osvr.util.OSVR_TimeValue;
import osvr.util.OSVR_Vec3;

/**
 *
 * @author Rickard
 */
public class QuaternionTest {
    public static void main(String[] args){
        LibraryLoader.loadLibraries();
        OSVR_Quaternion q = new OSVR_Quaternion();
        System.out.println(q.getNativeHandle());
        
        OSVR_Vec3 v = new OSVR_Vec3();
        System.out.println(v.getNativeHandle());
        
        OSVR_Pose3 pose = new OSVR_Pose3();
        System.out.println(pose.getNativeHandle());
        System.out.println(pose.getRotation().getNativeHandle());
        System.out.println(pose.getTranslation().getNativeHandle());
        
        OSVR_TimeValue timeValue = new OSVR_TimeValue();
        System.out.println(timeValue.getNativeHandle());
    }
}
