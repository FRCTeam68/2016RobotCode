
package org.usfirst.frc.team68.robot.obsolete;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team68.robot.Robot;
import org.usfirst.frc.team68.robot.RobotMap;

/**
 *
 */
public class ArmDrawbridge extends Command {
	private static double percent = 0.0;
	private static boolean isDone = false;
    public ArmDrawbridge() {
        // Use requires() here to declare subsystem dependencies
//        requires(Robot.arm);
//        requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
//    	percent = 0.0;
    	isDone = false;
//    	Robot.driveTrain.setModePosition();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	if(Robot.driveTrain.isDrivetrainPercentVbus()){
//    		isDone = true;
//    		return;
//    	}
//    	
//    	Robot.driveTrain.setPosition(
//    			RobotMap.DtDrawbridgePath.getPointAtPercent(percent).x, 
//    			RobotMap.DtDrawbridgePath.getPointAtPercent(percent).x);
//    	
//    	
//    	SmartDashboard.putNumber("reqPercent", RobotMap.DtDrawbridgePath.getPointAtPercent(percent).x);
//    	Robot.arm.setArmPoint(RobotMap.ArmDrawbridgePath.getPointAtPercent(percent), 10);
//    	
//    	percent += 0.5;
//    	if(percent >= 100)
//    		isDone = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isDone;
    }

    // Called once after isFinished returns true
    protected void end() {
//    	Robot.driveTrain.setModePercentVbus();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
