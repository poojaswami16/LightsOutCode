package org.usfirst.frc.team178.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team178.robot.Robot;
import org.usfirst.frc.team178.robot.subsystems.Lights;

/**
 *
 */
public class Lit extends Command {
	Lights lights;
	public Lit() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.lights);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		lights = Robot.lights;
	/*	
		zero = DigitalInput(0);
		one = DigitalInput(1);
		two = DigitalInput(2);
		three = DigitalInput(3);
		four = DigitalInput(4);
		*/
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		lights.sendMessage("random");
		
		
		
		
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
