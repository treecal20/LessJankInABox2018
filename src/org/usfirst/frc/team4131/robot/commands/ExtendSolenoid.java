package org.usfirst.frc.team4131.robot.commands;

import org.usfirst.frc.team4131.robot.Robot;
import org.usfirst.frc.team4131.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class ExtendSolenoid extends Command {
	Boolean flipFlop = false;
	
	public ExtendSolenoid() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.solenoid);
		requires(Robot.air);
	}
	
	@Override
	protected void initialize() {
	}
	
	public void execute() {
		if(Robot.air.getPressure()>RobotMap.PRESSURE_SENSOR_LIMIT&&Robot.OI.extendSolenoidPressed()) {
			if(flipFlop==false) {
				extend();
				flipFlop=true;
			} else {
				retract();
				flipFlop=false;
			}
		}
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void extend() {
		Robot.solenoid.extendSolenoid();
	}
	
	protected void retract() {
		Robot.solenoid.retractSolenoid();
	}

}
