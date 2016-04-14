/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.java.examples.clients;

import osvr.clientkit.ContextWrapper;
import osvr.java.util.LibraryLoader;

/**
 *
 * @author reden (neph1@github)
 */
public class DisplayParameters {
    public static void main(String[] args){
        LibraryLoader.loadLibraries();
        
        ContextWrapper context = new ContextWrapper();
        context.initialize("DisplayParameters");
        
        String displayDescription = context.getStringParameter("/display");
        
        System.out.println(displayDescription);
        
        context.dispose();
    }
}
