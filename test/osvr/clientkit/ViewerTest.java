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
public class ViewerTest {
    
    public static void main(String[] args){
        LibraryLoader.loadLibraries();
        
        ContextWrapper context = new ContextWrapper();
        context.initialize("InterfaceTest");
        
        OSVR_DisplayConfig display = null;
        
        while(display == null || !display.valid()){
            display = new OSVR_DisplayConfig(context);
        }
        
        System.out.println(display.getNativeHandle());
        
        display.getNumViewers();
        
        OSVR_Viewer v = new OSVR_Viewer();
        display.getViewer(0, v);
        System.out.println(v.getNativeHandle());
        display.dispose();
    }
}
