/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.config;

import java.util.logging.Level;
import java.util.logging.Logger;
import json.JSONArray;
import json.JSONException;
import json.JSONObject;

/**
 *
 * @author reden (neph1@github)
 */
public class DisplayParameters {
    
    private JSONObject jsonObject;
    
    private Eye[] eyes;
    private Resolution[] resolutions;
    
    private float[] polynomialCoeffsRed[];
    private float[] polynomialCoeffsBlue[];
    private float[] polynomialCoeffsGreen[];

    public DisplayParameters(String displayDescription) {
        try {
            parse(displayDescription);
        } catch (JSONException ex) {
            Logger.getLogger(DisplayParameters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void parse(String displayParameters) throws JSONException{
        jsonObject = new JSONObject(displayParameters).getJSONObject("hmd");
        JSONArray jsonEyes = (JSONArray) jsonObject.get("eyes");
        eyes = new Eye[jsonEyes.length()];
        for(int i = 0; i < jsonEyes.length(); i++){
            eyes[i] = new Eye(jsonEyes.getJSONObject(i));
        }
        JSONArray jsonRes = (JSONArray)jsonObject.get("resolutions");
        resolutions = new Resolution[jsonRes.length()];
        for(int i = 0; i < jsonRes.length(); i++){
            resolutions[i] = new Resolution(jsonRes.getJSONObject(i));
        }
    }
    
    public Object get(String key) throws JSONException{
        return jsonObject.get(key);
    }
    
    public JSONObject getJsonObject(){
        return jsonObject;
    }
    
    public Eye getEye(int eye){
        return eyes[eye];
    }
    
    public Resolution getResolution(int res){
        return resolutions[res];
    }
            
    
    public class Resolution{
        
        int width;
        int height;
        
        Resolution(JSONObject res){
            try {
                width = res.getInt("width");
                height = res.getInt("height");
            } catch (JSONException ex) {
                Logger.getLogger(DisplayParameters.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }
        
        
    }
    
    public class Eye{
        
        float center_proj_x;
        float center_proj_y;
        int rotate_180;
        
        Eye(JSONObject eye){
            try {
                center_proj_x = (float) eye.getDouble("center_proj_x");
                center_proj_y = (float) eye.getDouble("center_proj_y");
                rotate_180 = eye.getInt("rotate_180");
            } catch (JSONException ex) {
                Logger.getLogger(DisplayParameters.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        public float getCenter_proj_x() {
            return center_proj_x;
        }

        public float getCenter_proj_y() {
            return center_proj_y;
        }

        public int getRotate_180() {
            return rotate_180;
        }
        
        
    }
}
