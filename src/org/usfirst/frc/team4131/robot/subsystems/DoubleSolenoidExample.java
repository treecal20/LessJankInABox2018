package org.usfirst.frc.team4131.robot.subsystems;

import org.usfirst.frc.team4131.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DoubleSolenoidExample extends Subsystem {
	private DoubleSolenoid solenoid1;
	
	public DoubleSolenoidExample() {
		solenoid1 = new DoubleSolenoid(RobotMap.DOUBLE_SOLENOID_FORWARD, RobotMap.DOUBLE_SOLENOID_BACKWARD);
	
	}
	
	public void extendSolenoid() {
		solenoid1.set(DoubleSolenoid.Value.kForward);
	}
	
	public void retractSolenoid() {
		solenoid1.set(DoubleSolenoid.Value.kReverse);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
}
