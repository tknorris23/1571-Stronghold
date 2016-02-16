package org.usfirst.frc1571.NewRobot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc1571.NewRobot.RobotMap;
import org.usfirst.frc1571.NewRobot.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class AuxDrive extends Subsystem {
    SpeedController auxLeft = RobotMap.auxDriveController1;
    SpeedController auxRight = RobotMap.auxDriveController2;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void auxStop() {
    	auxLeft.set(0.0);
    	auxRight.set(0.0);
    }
    
    public void auxRun() {
    	auxLeft.set(0.9);
    	auxRight.set(-0.9);
    }
}

