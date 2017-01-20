
package org.usfirst.frc.team68.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CancelCommand extends Command {
	boolean isFinished = false;

    public CancelCommand() {
        // Use requires() here to declare subsystem dependencies
    	//requires();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	// to do
    	isFinished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isFinished;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
