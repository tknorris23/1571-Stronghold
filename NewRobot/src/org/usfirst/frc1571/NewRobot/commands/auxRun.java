package org.usfirst.frc1571.NewRobot.commands;

//import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1571.NewRobot.Robot;
import org.usfirst.frc1571.NewRobot.RobotMap;
import org.usfirst.frc1571.NewRobot.OI;
//import org.usfirst.frc1571.NewRobot.RobotMap;
//import org.usfirst.frc1571.NewRobot.subsystems.armMotor;

/**
 *
 */
public class auxRun extends Command {
	
	//SpeedController auxRight = RobotMap.auxDriveController2;
	
    public auxRun() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.auxDrive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//auxRight.set(-0.9);
    	//Robot.auxDrive.auxRun();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//RobotMap.auxDriveController1.set(OI.mainStickRTrigger);
    	//RobotMap.auxDriveController2.set(-0.5);
    	//Robot.auxDrive.auxRunWithJoystick();
    	//RobotMap.auxDrive.drive(OI.mainStickRTrigger, 0);
    	//RobotMap.auxDrive.arcadeDrive(Robot.oi.mainStickRStickX, Robot.oi.mainStickRStickY);
    	Robot.auxDrive.auxRun();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.auxDriveController1.set(0.0);
    	RobotMap.auxDriveController2.set(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	//Robot.auxDrive.auxRun();
    	end();
    }
}
