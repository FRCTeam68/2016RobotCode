
package org.usfirst.frc.team68.robot.obsolete;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team68.robot.MathUtil;
import org.usfirst.frc.team68.robot.Robot;

/**
 *
 */
public class ArmWriteAnglestoDash extends Command {
	boolean isFinished = false;

    public ArmWriteAnglestoDash() {
        // Use requires() here to declare subsystem dependencies
//    	requires(Robot.arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	SmartDashboard.putNumber("Base Angle: ", Robot.arm.getBase());
//    	SmartDashboard.putNumber("Shoulder Angle: ", Robot.arm.getShoulder());
//    	SmartDashboard.putNumber("Elbow Angle: ", Robot.arm.getElbow());
//    	SmartDashboard.putNumber("Base Setpoint", MathUtil.rotToDegrees(Robot.arm.motorBase.getSetpoint()));
//    	SmartDashboard.putNumber("Shoulder Setpoint", MathUtil.rotToDegrees(Robot.arm.motorShoulder.getSetpoint()));
//    	SmartDashboard.putNumber("Elbow Setpoint", MathUtil.rotToDegrees(Robot.arm.motorElbow.getSetpoint()));
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
