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
public class MinimalInitTest {
    
    public static void main(String[] args){
        LibraryLoader.loadLibraries();
        
        MinimalInit minimalInit = new MinimalInit();
        
        int number = minimalInit.main();
        
        System.out.println(number);
    }
}
