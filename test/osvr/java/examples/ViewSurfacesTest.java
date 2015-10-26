/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.java.examples;

import java.util.logging.Level;
import java.util.logging.Logger;
import osvr.clientkit.ContextWrapper;
import osvr.clientkit.OSVR_DisplayConfig;
import osvr.java.util.LibraryLoader;

/**
 *
 * @author Rickard
 */
public class ViewSurfacesTest {
    public static void main(String[] args){
        LibraryLoader.loadLibraries();
        
        ContextWrapper context = new ContextWrapper();
        context.initialize("osvr.java.examples.clients.ViewSurfacesTest");
        
        OSVR_DisplayConfig display;
        
        do{
            System.out.println("Trying to get the display config");
            context.update();
            display = new OSVR_DisplayConfig(context);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ViewSurfacesTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }while(!display.valid());
        
        display.setupDisplay();
    }
}
