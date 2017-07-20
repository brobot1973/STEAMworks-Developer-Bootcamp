package org.usfirst.frc.team3946.robot.subsystems;

import org.usfirst.frc.team3946.robot.RobotMap;
import org.usfirst.frc.team3946.robot.commands.StowWinch;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Winch extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	private Talon winchMotor = new Talon(RobotMap.winchMotorPort);
	private DigitalInput winchLimitSwitch = new DigitalInput(RobotMap.winchLimitSwitchPort);

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new StowWinch());
	}
	
	public void setSpeed(double newSpeed) {
		winchMotor.set(newSpeed);
	}
	
	public boolean isUp() {
		return winchLimitSwitch.get();
	}
	
}
