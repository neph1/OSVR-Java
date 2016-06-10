/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.config;

import java.util.logging.Level;
import java.util.logging.Logger;
import json.JSONException;
import json.JSONObject;

/**
 *
 * @author reden (neph1@github)
 */
public class RenderManagerConfig {
    
    private JSONObject jsonObject;
    
    private int xPosition;
    private int yPosition;
    private boolean directModeEnabled;

    public RenderManagerConfig(String renderConfig) {
        try {
            parse(renderConfig);
        } catch (JSONException ex) {
            Logger.getLogger(RenderManagerConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void parse(String renderConfig) throws JSONException{
        jsonObject = new JSONObject(renderConfig).getJSONObject("renderManagerConfig");
        directModeEnabled = jsonObject.getBoolean("directModeEnabled");
        xPosition = ((JSONObject)jsonObject.get("window")).getInt("xPosition");
        yPosition = ((JSONObject)jsonObject.get("window")).getInt("yPosition");
        
    }
    
    public Object get(String key) throws JSONException{
        return jsonObject.get(key);
    }
    
    public JSONObject getJsonObject(){
        return jsonObject;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public boolean isDirectModeEnabled() {
        return directModeEnabled;
    }
}
