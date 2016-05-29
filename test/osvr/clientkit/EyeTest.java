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
public class EyeTest {

    public static void main(String[] args) {
        LibraryLoader.loadLibraries();

        ContextWrapper context = new ContextWrapper();
        context.initialize("InterfaceTest");

        while (!context.checkStatus()) {
            System.out.println("context not started ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(EyeTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            context.update();
        }

        OSVR_DisplayConfig display = new OSVR_DisplayConfig(context);
        while (!display.valid()) {
            System.out.println("display not valid ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(EyeTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            display = new OSVR_DisplayConfig(context);

        }

        while (!display.checkStartup()) {
            System.out.println("display not started ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(EyeTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            context.update();
        }
        System.out.println("Display " + display.getNativeHandle());
        context.update();
        display.getNumViewers();
        OSVR_Viewer v = new OSVR_Viewer();
        display.getViewer(0, v);
        System.out.println("Viewer: " + " " + v.getNativeHandle());
        System.out.println("Viewer: " + " " + v.getViewerID());
        System.out.println("Viewer: " + " " + v.getNativeHandle());
        OSVR_Eye eye = new OSVR_Eye();

        v.getEye(0, eye);
        System.out.println("Eye: " + eye.getEyeID());
//        System.out.println(eye.getNativeHandle());
//        DisplayHelper helper = new DisplayHelper(display, v);

        float[] matrix = new float[16];
//        helper.getViewMatrix(eye, matrix);
//        eye.getNumSurfaces();
        eye.getViewMatrix(matrix);
        
        for (int i = 0; i < 16; i++) {
            System.out.println("" + matrix[i]);
        }
        matrix = new float[16];
//        eye.getViewMatrix( matrix);
        display.dispose();
    }
}
