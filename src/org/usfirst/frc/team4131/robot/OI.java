package org.usfirst.frc.team4131.robot;

import org.usfirst.frc.team4131.robot.commands.ExtendSolenoid;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;



public class OI {
	private Joystick leftStick = new Joystick(RobotMap.LEFT_JOYSTICK);
	private Joystick rightStick = new Joystick(RobotMap.RIGHT_JOYSTICK);
	private JoystickButton extendSolenoid = new JoystickButton(rightStick, 4);
	
	public double getLeftSpeed(){
		return constrain(leftStick.getRawAxis(1));
	}
	
	public double getRightSpeed(){
		return constrain(rightStick.getRawAxis(1));
	}
	
	private double constrain(double value){
		return Math.max(-1, Math.min(1, value));
	}
	
	public boolean extendSolenoidPressed() {
		return extendSolenoid.get();
	}
}
