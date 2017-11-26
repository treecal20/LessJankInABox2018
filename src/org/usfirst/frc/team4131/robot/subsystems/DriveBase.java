package org.usfirst.frc.team4131.robot.subsystems;

import org.usfirst.frc.team4131.robot.RobotMap;
import org.usfirst.frc.team4131.robot.commands.Move;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveBase extends Subsystem{
	private CANTalon leftMotor1, leftMotor2, rightMotor1, rightMotor2;
	
	public DriveBase(){
		leftMotor1 = new CANTalon(RobotMap.DRIVE_LEFT1);
		leftMotor2 = new CANTalon(RobotMap.DRIVE_LEFT2);
		rightMotor1 = new CANTalon(RobotMap.DRIVE_RIGHT1);
		rightMotor2 = new CANTalon(RobotMap.DRIVE_RIGHT2);
	}
	
	protected void initDefaultCommand(){
		setDefaultCommand(new Move());
	}
	public void move(double left, double right) {
		leftMotor1.set(left);
		leftMotor2.set(left);
		rightMotor1.set(right);
		rightMotor2.set(right);
	}
}
