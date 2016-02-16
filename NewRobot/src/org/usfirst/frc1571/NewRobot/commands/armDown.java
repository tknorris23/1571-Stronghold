package org.usfirst.frc1571.NewRobot.commands;


import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1571.NewRobot.Robot;
import org.usfirst.frc1571.NewRobot.subsystems.armMotor;

/**
 *
 */
public class armDown extends Command {

    public armDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.armMotor);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.armMotor.armDown();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !Robot.armMotor.isSwitch1Set();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.armMotor.armStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.armMotor.armStop();
    }
}
