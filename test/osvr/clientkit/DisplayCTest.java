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
 * @author reden (neph1@github)
 */
public class DisplayCTest {
    public static void main(String[] args) {
        LibraryLoader.loadLibraries();

        ContextWrapper context = new ContextWrapper();
        context.initialize("InterfaceTest");

        while (!context.checkStatus()) {
            System.out.println("context not started ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(DisplayCTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            context.update();
        }

        OSVR_DisplayConfig display = new OSVR_DisplayConfig(context);
        while (!display.valid()) {
            System.out.println("display not valid ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(DisplayCTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            display = new OSVR_DisplayConfig(context);

        }

        while (!display.checkStartup()) {
            System.out.println("display not started ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(DisplayCTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            context.update();
        }
        
        DisplayC displayC = new DisplayC();
        System.out.println("display " + display.getNativeHandle());
        int viewers = displayC.osvrClientGetNumViewers(display);
        System.out.println("viewers " + viewers);
        int eyes = displayC.osvrClientGetNumEyesForViewer(display, 0);
        System.out.println("eyes " + eyes);
        int surfaces = displayC.osvrClientGetNumSurfacesForViewerEye(display, 0, 0);
        System.out.println("surfaces " + surfaces);
        
        
        int[] viewport = new int[4];
        displayC.osvrClientGetRelativeViewportForViewerEyeSurface(display, 0, 0, 0, viewport);
        for(int i = 0; i < 4; i++){
            System.out.println("viewport " + i + " " + viewport[i]);
        }
        
        float[]viewMatrix = new float[16];
        displayC.osvrClientGetViewerEyeViewMatrixf(display, 0, 0, 0, viewMatrix);
        for(int i = 0; i < 16; i++){
            System.out.println("viewmatrix " + i + " " + viewMatrix[i]);
        }
        context.dispose();
        display.dispose();
        
        
    }
}