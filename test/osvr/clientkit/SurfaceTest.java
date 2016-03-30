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
public class SurfaceTest {
    
    public static void main(String[] args){
        LibraryLoader.loadLibraries();
        
        ContextWrapper context = new ContextWrapper();
        context.initialize("InterfaceTest");
        
        OSVR_DisplayConfig display = new OSVR_DisplayConfig(context);
        while(!display.valid()){
            display = new OSVR_DisplayConfig(context);
        }
        
        System.out.println(display.getNativeHandle());
        
        display.getNumViewers();
        OSVR_Viewer v = new OSVR_Viewer();
        display.getViewer(0, v);
        System.out.println("Viewer " + v.getNativeHandle());
        OSVR_Eye eye = new OSVR_Eye();
        display.getEye(0, 0, eye);
        System.out.println("Eye " + eye.getNativeHandle());
        OSVR_Surface s = new OSVR_Surface();
        display.getSurface(0, 0, 0, s);
        System.out.println("Surface " + s.getNativeHandle());
        display.dispose();
    }
}
