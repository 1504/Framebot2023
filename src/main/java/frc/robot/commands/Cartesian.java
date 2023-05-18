// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class Cartesian extends CommandBase {

  /*
   * private final DoubleSupplier xSpeed;
   * private final DoubleSupplier ySpeed;
   * private final DoubleSupplier zRotation;
   */

  private final double _xSpeed;
  private final double _ySpeed;
  private final double _zRotation;

  private final Drivetrain drivetrain;

  // public Cartesian(DoubleSupplier x, DoubleSupplier y, DoubleSupplier
  // z,Drivetrain d)
  public Cartesian(double x, double y, double z, Drivetrain d) {
    _xSpeed = x;
    _ySpeed = y;
    _zRotation = z;
    drivetrain = d;
    addRequirements(d);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    // drivetrain.cartesianDrive(xSpeed.getAsDouble(), ySpeed.getAsDouble(),
    // zRotation.getAsDouble());
    drivetrain.cartesianDrive(_xSpeed, _ySpeed, _zRotation);
  }

  @Override
  public void end(boolean interrupted) {
    drivetrain.cartesianDrive(0, 0, 0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
