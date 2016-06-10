/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.java.examples.clients;

import java.util.logging.Level;
import java.util.logging.Logger;
import json.JSONException;
import json.JSONObject;
import osvr.clientkit.ContextWrapper;
import osvr.java.util.LibraryLoader;
import osvr.config.DisplayParameters;
import osvr.config.RenderManagerConfig;

/**
 *
 * @author reden (neph1@github)
 */
public class TestRenderParameters {
    public static void main(String[] args){
        LibraryLoader.loadLibraries();
        
        ContextWrapper context = new ContextWrapper();
        context.initialize("DisplayParameters");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestRenderParameters.class.getName()).log(Level.SEVERE, null, ex);
        }
        String displayDescription = context.getStringParameter("/renderManagerConfig");
        
        System.out.println("result: " + displayDescription);
        
        RenderManagerConfig config = new RenderManagerConfig(displayDescription);
        
        try {
            int x = (Integer) ((JSONObject)((JSONObject)config.get("renderManagerConfig")).get("window")).get("xPosition");
            System.out.println("xPOsition: " + x);
        } catch (JSONException ex) {
            Logger.getLogger(TestRenderParameters.class.getName()).log(Level.SEVERE, null, ex);
        }
        context.dispose();
    }
}
