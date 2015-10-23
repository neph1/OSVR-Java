/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.java.examples.clients;

import osvr.java.util.LibraryLoader;

/**
 *
 * @author Rickard
 */
public class TrackerCallbackTest {
    
    public static void main(String[] args){
        LibraryLoader.loadLibraries();
        
        TrackerCallback trackerCallback = new TrackerCallback();
        
        int number = trackerCallback.main();
        System.out.println(number);
        trackerCallback = new TrackerCallback();
        
        number = trackerCallback.main();
        System.out.println(number);
    }
}
