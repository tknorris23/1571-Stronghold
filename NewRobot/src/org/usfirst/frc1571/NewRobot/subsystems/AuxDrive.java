package org.usfirst.frc1571.NewRobot.subsystems;

//import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc1571.NewRobot.OI;
//import org.usfirst.frc1571.NewRobot.Robot;
import org.usfirst.frc1571.NewRobot.RobotMap;
//import org.usfirst.frc1571.NewRobot.commands.DriveWithJoystick;
import org.usfirst.frc1571.NewRobot.commands.auxRun;

//import org.usfirst.frc1571.NewRobot.commands.*;
import edu.wpi.first.wpilibj.*;

//import edu.wpi.first.wpilibj.command.Subsystem;
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
        //setDefaultCommand(new auxRun());
    	//setDefaultCommand(new ());
    	//setDefaultCommand(new auxStop());
    	//setDefaultCommand(new auxRun());
    }
    //Check Later
    
    //public void auxStop() {
    //	auxLeft.set(0.0);
    //	auxRight.set(0.0);
    //}
    
    //public void auxRun() {
    //	auxLeft.set(1.0);
    //	auxRight.set(-1.0);
    //}
    
    public void auxRunWithJoystick() {
    	//RobotMap.auxDrive.arcadeDrive(Robot.oi.mainStickRightX, Robot.oi.mainStickRightY);
    }
    
    public void auxRun() {
    	//RobotMap.auxDriveController1.set(OI.mainStickRTrigger);
    	RobotMap.auxDrive.drive(0.5,  0);
    }
}

