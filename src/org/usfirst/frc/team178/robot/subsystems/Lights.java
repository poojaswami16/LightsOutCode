package org.usfirst.frc.team178.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.I2C;

public class Lights extends Subsystem {
	
	private I2C arduino;
	
	public Lights() {
		arduino = new I2C(I2C.Port.kOnboard, 8);
	}
	
	public void sendMessage(String pattern) {
		String message = pattern;
    	message = message.toLowerCase();
    	System.out.println(message);
    	arduino.writeBulk(message.getBytes());
	}


public void initDefaultCommand() {
	// Set the default command for a subsystem here.
	// setDefaultCommand(new MySpecialCommand());
}

}