package osvr.clientkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reden (neph1@github)
 */
public class ContextC {
    
    public native OSVR_ClientContext osvrClientInit(String applicationIdentifier, int flags);
}
