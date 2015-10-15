/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.java.util;

import java.io.File;

/**
 * Loads native dlls
 * @author Rickard
 */
public class LibraryUtil {
    
    private static boolean initialized;
    
    static{
        
    }
    
    public static void loadLibraries(){
        String path = new File("").getAbsolutePath();
        
        if(System.getProperty("sun.arch.data.model").equals("64")){
            System.load(path + "\\native\\windows\\x64\\opencv_core2410.dll");
            System.load(path + "\\native\\windows\\x64\\osvrUtil.dll");
            System.load(path + "\\native\\windows\\x64\\osvrCommon.dll");
            System.load(path + "\\native\\windows\\x64\\osvrClient.dll");
            System.load(path + "\\native\\windows\\x64\\osvrClientKit.dll");
            System.load(path + "\\native\\windows\\x64\\libOSVR-Java.dll");
        } else {
            
        }
        
        initialized = true;
    }
}
