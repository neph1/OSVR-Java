/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.clientkit;

import java.util.logging.Level;
import java.util.logging.Logger;
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
        context.update();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(DisplayConfigTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("context update " + context.getNativeHandle());
        OSVR_DisplayConfig display = new OSVR_DisplayConfig(context);
        System.out.println("display");
        while(!display.valid()){
            display = new OSVR_DisplayConfig(context);
            System.out.println("not valid");
        }
        
        while(!display.checkStartup()){
            System.out.println("not started");
            context.update();
        }
        
        System.out.println(display.getNativeHandle());
        context.update();
        display.getNumViewers();
        display.dispose();
    }
}
