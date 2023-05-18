// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pneumatics extends SubsystemBase {
  private Compressor m_Compressor = new Compressor(0, PneumaticsModuleType.CTREPCM);
  private DoubleSolenoid solo = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 2);

  public Pneumatics() {
    m_Compressor.enableDigital();
  }

  public void enableSolenoid() {
    solo.set(Value.kForward);
  }

  public void disableSolenoid() {
    solo.set(Value.kReverse);
  }

  @Override
  public void periodic() {
  }
}
