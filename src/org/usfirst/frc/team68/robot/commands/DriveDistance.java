
package org.usfirst.frc.team68.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team68.robot.MathUtil;
import org.usfirst.frc.team68.robot.Robot;

/**
 *
 */
public class DriveDistance extends Command {
	boolean isFinished = false;
	double timeout;
	double left, right;

    public DriveDistance(double dleft, double dright, double timeout) {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.driveTrain);
    	setTimeout(timeout);
    	left = dleft;
    	right = dright;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.driveTrain.setModePosition();
    	Robot.driveTrain.zeroEncoders();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.setPosition(left, -1*right);

    	if(MathUtil.withinThresh(Robot.driveTrain.getPositionLeft(), left, 0.2) && MathUtil.withinThresh(Robot.driveTrain.getPositionRight(), -1*right, 0.2)){
    	 isFinished = true;
    	}

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isFinished || this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	SmartDashboard.putString("auto1", this.isRunning()?"running":"notRunning");
    	Robot.driveTrain.setModePercentVbus();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
