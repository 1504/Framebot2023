// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Pneumatics;

public class Disable extends CommandBase {

  private Pneumatics m_Pneumatics;

  public Disable(Pneumatics p) {
    m_Pneumatics = p;
  }

  @Override
  public void initialize() {
    m_Pneumatics.disableSolenoid();
  }

  @Override
  public void execute() {
  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
