package org.usfirst.frc1571.NewRobot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1571.NewRobot.Robot;
import org.usfirst.frc1571.NewRobot.subsystems.armMotor;

/**
 *
 */
public class auxRun extends Command {

    public auxRun() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.auxDrive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.auxDrive.auxRun();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.auxDrive.auxRun();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.auxDrive.auxStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.auxDrive.auxRun();
    }
}
