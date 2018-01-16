package org.usfirst.frc.team2523.robot.subsystems;

import org.usfirst.frc.team2523.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClampSystem extends Subsystem {
	Spark clampMotor = new Spark(RobotMap.clampMotor);
	Spark swingMotor = new Spark(RobotMap.swingMotor);
	// Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void openClamp() {
		
		clampMotor.set(1);
		
	}
	public void closeClamp() {
		
		clampMotor.set(-1);
		
	}
	public void stopClamp() {
		
		clampMotor.set(0);
		
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
   
    public void openSwing() {
    	
    	swingMotor.set(1);
    	
    }
    public void closeSwing(){
    	
    	swingMotor.set(-1);
    	
    }
    public void stopSwing() {
    	
    	swingMotor.set(0);
    	
    }
}


