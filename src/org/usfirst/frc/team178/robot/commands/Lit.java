package org.usfirst.frc.team178.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team178.robot.Robot;
import org.usfirst.frc.team178.robot.subsystems.Lights;

/**
 *
 */
public class Lit extends Command {
	
	DigitalInput zero;
	DigitalInput one;
	DigitalInput two
	DigitalInput three;
	DigitalInput four;
		
		
	Lights lights;
	public Lit() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.lights);
		
		zero = new DigitalInput(0);
		one = new DigitalInput(1);
		two = new DigitalInput(2);
		three = new DigitalInput(3);
		four = new DigitalInput(4);
		
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		lights = Robot.lights;
		
		
		lights.sendMessage("random");

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		
		if(zero.get())
			lights.sendMessage(0);
		if(one.get())
			lights.sendMessage(1);
		if(two.get())
			lights.sendMessage(2);
		if(three.get())
			lights.sendMessage(3);
		if(four.get())
			lights.sendMessage(4);
		
	
		
		
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
