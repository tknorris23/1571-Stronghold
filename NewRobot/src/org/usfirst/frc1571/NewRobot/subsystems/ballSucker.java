package org.usfirst.frc1571.NewRobot.subsystems;

import org.usfirst.frc1571.NewRobot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ballSucker extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void runSucker() {
		RobotMap.ballSucker.set(1.0);
	}
	
	public void stopSucker() {
		RobotMap.ballSucker.set(0.0);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

