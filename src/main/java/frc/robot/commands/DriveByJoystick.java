// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.Joysticks;
import frc.robot.Constants.Motors;

public class DriveByJoystick extends CommandBase {
  private final MecanumDrive mecDrive = new MecanumDrive(Motors.DRIVE_FRONT_LEFT, Motors.DRIVE_FRONT_RIGHT, Motors.DRIVE_BACK_LEFT, Motors.DRIVE_BACK_RIGHT);
  /** Creates a new DriveByJoystick. */
  public DriveByJoystick() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

// Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mecDrive.driveCartesian(Joysticks.RIGHT_JOYSTICK.getY(), Joysticks.RIGHT_JOYSTICK.getX(), Joysticks.RIGHT_JOYSTICK.getZ());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}