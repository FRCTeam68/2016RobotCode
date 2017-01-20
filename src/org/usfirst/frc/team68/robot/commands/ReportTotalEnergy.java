
package org.usfirst.frc.team68.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team68.robot.Robot;
import org.usfirst.frc.team68.robot.RobotMap;

/**
 *
 */
public class ReportTotalEnergy extends Command {

    public ReportTotalEnergy() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.pdpMonitor);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	SmartDashboard.putNumber("Total Energy Drawn:", Robot.pdpMonitor.getTotalEnergy());
    	SmartDashboard.putNumber("Total Energy Drawn (line plot):", Robot.pdpMonitor.getTotalEnergy());
    	SmartDashboard.putNumber("Voltage (line plot):", Robot.pdpMonitor.getVoltage());
    	SmartDashboard.putNumber("Total Energy Remaining:", RobotMap.ENERGY_FULL - Robot.pdpMonitor.getTotalEnergy());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
