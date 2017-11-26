package org.usfirst.frc.team4131.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4131.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;

public class Pneumatics extends Subsystem {
	
	private AnalogInput pressureSensor;
	private int everyXCycles, Cycle=0;
	
	public Pneumatics() {
		pressureSensor = new AnalogInput(RobotMap.PRESSURE_SENSOR);
		everyXCycles = 100;
	}
	
	public double getPressure() {
		double pressure = 0.0;
		pressure = 250*(pressureSensor.getVoltage())-25;
		return pressure;
	}
	
	public void sendPressure() {
		if(Cycle==0) {
			System.out.println(getPressure());
			Cycle = everyXCycles;
		}
		Cycle--;
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
}
