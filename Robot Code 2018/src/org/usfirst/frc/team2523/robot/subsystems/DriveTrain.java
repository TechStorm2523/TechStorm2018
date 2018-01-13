package org.usfirst.frc.team2523.robot.subsystems;

import org.usfirst.frc.team2523.robot.OI;
import org.usfirst.frc.team2523.robot.Robot;
import org.usfirst.frc.team2523.robot.commands.Drive;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {

	
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	
	WPI_TalonSRX leftFront = new WPI_TalonSRX(1); //Change these values once robot actually exists
	WPI_TalonSRX leftBack = new WPI_TalonSRX(1);
	WPI_TalonSRX rightFront = new WPI_TalonSRX(1);
	WPI_TalonSRX rightBack = new WPI_TalonSRX(1);
	SpeedControllerGroup left = new SpeedControllerGroup(leftFront,leftBack);
	SpeedControllerGroup right = new SpeedControllerGroup(rightFront,rightBack);
	DifferentialDrive dr = new DifferentialDrive(left,right);
	
	public void Drive() {
		dr.arcadeDrive(OI.DriveStick.getY(), OI.DriveStick.getTwist());
		
	}
	
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Drive());
    }
}

