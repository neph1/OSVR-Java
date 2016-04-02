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
public class EyeTest {
    
    public static void main(String[] args){
        LibraryLoader.loadLibraries();
        
        ContextWrapper context = new ContextWrapper();
        context.initialize("InterfaceTest");
        
        OSVR_DisplayConfig display = new OSVR_DisplayConfig(context);
        while(!display.valid()){
            System.out.println("display not valid ");
            display = new OSVR_DisplayConfig(context);
        }
        
        while (!display.checkStartup()) {
            System.out.println("display not started ");
            context.update();
        }
        System.out.println(display.getNativeHandle());
        context.update();
        display.getNumViewers();
        OSVR_Viewer v = new OSVR_Viewer();
        display.getViewer(0, v);
        System.out.println("Viewer: " + " " + v.getNativeHandle());
        System.out.println("Viewer: " + " " + v.getID());
        System.out.println("Viewer: " + " " + v.getNativeHandle());
        OSVR_Eye eye = new OSVR_Eye();
        
        
        display.getEye(v.getID(), 0, eye);
        System.out.println("Eye: " + eye.getID());
//        System.out.println(eye.getNativeHandle());
        DisplayHelper helper = new DisplayHelper(display, v);
        
        float[] matrix = new float[16];
        helper.getViewMatrix(eye, matrix);
        for(int i = 0; i < 16; i++){
            System.out.println(""+ matrix[i]);
        }
        display.dispose();
    }
}
