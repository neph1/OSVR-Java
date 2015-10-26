/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.clientkit;

import osvr.java.util.LibraryLoader;

/**
 *
 * @author Rickard
 */
public class DisplayConfigTest {
    
    public static void main(String[] args){
        LibraryLoader.loadLibraries();
        
        ContextWrapper context = new ContextWrapper();
        context.initialize("InterfaceTest");
        
        OSVR_DisplayConfig display = new OSVR_DisplayConfig(context);
        System.out.println(display);
    }
}
