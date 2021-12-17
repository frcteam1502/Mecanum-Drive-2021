// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.DriveByJoystick;

public class Drivetrain extends SubsystemBase {
  private CANSparkMax frontLeft, frontRight, backLeft, backRight;
  MecanumDrive mecanumDrive;
  
  /** Creates a new Drivetrain. */
  public Drivetrain(CANSparkMax frontleft, CANSparkMax frontRight, CANSparkMax backLeft, CANSparkMax backRight ) {
    setDefaultCommand(new DriveByJoystick());
    this.frontLeft = frontleft;
    this.frontRight = frontRight;
    this.backLeft = backLeft;
    this.backRight = backRight;
    mecanumDrive = new MecanumDrive(frontLeft, backLeft, frontRight, backRight);
  }

  public void move(double ySpeed, double xSpeed, double zRotation) {
    mecanumDrive.driveCartesian(ySpeed, xSpeed, zRotation);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
