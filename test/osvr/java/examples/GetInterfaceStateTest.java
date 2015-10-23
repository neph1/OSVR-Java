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

/**
 *
 * @author Rickard
 */
public class GetInterfaceStateTest {
    
    
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
        } catch(Exception e){
            e.printStackTrace();
        }
        boolean status = context.checkStatus();
        System.out.println("status: " + status);
        context.dispose();
        
    }
    
    
}
