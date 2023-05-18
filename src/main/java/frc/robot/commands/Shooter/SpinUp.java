// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Launcher;

public class SpinUp extends CommandBase {

  private final Launcher m_Launcher;

  public SpinUp(Launcher l) {
    m_Launcher = l;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    m_Launcher.spinUp();
  }

  @Override
  public void end(boolean interrupted) {
    m_Launcher.stop();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
