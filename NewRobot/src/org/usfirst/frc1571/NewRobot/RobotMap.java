// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1571.NewRobot;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.DigitalInput;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveSpeedController1;
    public static SpeedController driveSpeedController2;
    public static SpeedController driveSpeedController3;
    public static SpeedController driveSpeedController4;
    public static SpeedController auxDriveController1;
    public static SpeedController auxDriveController2;
    public static RobotDrive driveRobotDrive41;
    public static RobotDrive auxDrive;
    public static SpeedController armMotorarmMotorController1;
    public static SpeedController armMotorarmMotorController2;
    public static DigitalInput armLimit1;
    public static DigitalInput armLimit2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveSpeedController1 = new Jaguar(0);
        LiveWindow.addActuator("Drive", "Speed Controller 1", (Jaguar) driveSpeedController1);
        
        driveSpeedController2 = new Jaguar(1);
        LiveWindow.addActuator("Drive", "Speed Controller 2", (Jaguar) driveSpeedController2);
        
        driveSpeedController3 = new Jaguar(2);
        LiveWindow.addActuator("Drive", "Speed Controller 3", (Jaguar) driveSpeedController3);
        
        driveSpeedController4 = new Jaguar(3);
        LiveWindow.addActuator("Drive", "Speed Controller 4", (Jaguar) driveSpeedController4);
        
        driveRobotDrive41 = new RobotDrive(driveSpeedController1, driveSpeedController2,
              driveSpeedController3, driveSpeedController4);
        
        driveRobotDrive41.setSafetyEnabled(true);
        driveRobotDrive41.setExpiration(0.1);
        driveRobotDrive41.setSensitivity(0.5);
        driveRobotDrive41.setMaxOutput(1.0);
        
        auxDriveController1 = new Jaguar(6);
        LiveWindow.addActuator("Aux", "AuxController 1", (Jaguar) auxDriveController1);
        auxDriveController2 = new Jaguar(7);
        LiveWindow.addActuator("Aux", "AuxController 2", (Jaguar) auxDriveController2);
        
        auxDrive = new RobotDrive(auxDriveController1, auxDriveController2);
        auxDrive.setSafetyEnabled(true);
       

        armMotorarmMotorController1 = new Spark(4);
        LiveWindow.addActuator("armMotor", "armMotorController 1", (Spark) armMotorarmMotorController1);
        
        armMotorarmMotorController2 = new Spark(5);
        LiveWindow.addActuator("armMotor", "armMotorController 2", (Spark) armMotorarmMotorController2);
        
        armLimit1 = new DigitalInput(3);
        armLimit2 = new DigitalInput(5);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
