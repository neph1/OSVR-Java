/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osvr.clientkit;

import osvr.util.OSVR_Pose3;

/**
 *
 * @author Rickard
 */
public class PoseReport {
    
    private long sensor;
    private OSVR_Pose3 pose;

    public long getSensor() {
        return sensor;
    }

    public void setSensor(long sensor) {
        this.sensor = sensor;
    }

    public OSVR_Pose3 getPose() {
        return pose;
    }

    public void setPose(OSVR_Pose3 pose) {
        this.pose = pose;
    }
    
    
}
