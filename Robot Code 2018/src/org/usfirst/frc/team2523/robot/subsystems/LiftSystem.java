package org.usfirst.frc.team2523.robot.subsystems;

import org.usfirst.frc.team2523.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LiftSystem extends Subsystem {
	Spark Liftmotor = new Spark(RobotMap.liftmotor);
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void liftup() {
			
		Liftmotor.set(1);
			
	}
	public void Liftdown() {
	
		Liftmotor.set(-1);
	
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    
    	
    }
    	
    
    	
}

