/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.java.examples;

import osvr.clientkit.ContextWrapper;
import osvr.clientkit.Interface;
import osvr.java.util.LibraryLoader;

/**
 *
 * @author Rickard
 */
public class GetInterfaceTest {
    
    
    public static void main(String[] args){
        LibraryLoader.loadLibraries();
        
        
//        TrackerCallbackToJava trackerCallback = new TrackerCallbackToJava();
        //trackerCallback.registerCallback(0, "/me/head");
//        long id = trackerCallback.initialize("TrackerTest");
        
        ContextWrapper context = new ContextWrapper();
        context.initialize("InterfaceTest");
        
        try{
            Interface iface = new Interface();
            context.getInterface("/me/head", iface);
            //iface.setNativeHandle(handle);
            System.out.println(iface.getNativeHandle());
        } catch(Exception e){
            e.printStackTrace();
        }
        boolean status = context.checkStatus();
        System.out.println("status: " + status);
        context.dispose();
        
        
    }
    
    
}
