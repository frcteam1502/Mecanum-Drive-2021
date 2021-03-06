// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.*;
import frc.robot.subsystems.Drivetrain;

public class DriveByJoystick extends CommandBase {
  private final Drivetrain drivetrain = new Drivetrain(Motors.DRIVE_FRONT_LEFT, Motors.DRIVE_FRONT_RIGHT, Motors.DRIVE_BACK_LEFT, Motors.DRIVE_BACK_RIGHT);
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
    drivetrain.move(
      Joysticks.RIGHT_JOYSTICK.getY(),
      Joysticks.RIGHT_JOYSTICK.getX(),
      Joysticks.RIGHT_JOYSTICK.getTwist());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }


  private final double truncateDecimal(double number){

    number = (((int)(number*100))/100.0);

    return number;
  }
}
