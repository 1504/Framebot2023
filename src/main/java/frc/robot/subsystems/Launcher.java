// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Launcher extends SubsystemBase {

  private final CANSparkMax front;
  private final CANSparkMax back;

  public Launcher() {
    front = new CANSparkMax(Constants.DriveConstants.FRONT, MotorType.kBrushed);
    back = new CANSparkMax(Constants.DriveConstants.BACK, MotorType.kBrushed);
  }

  public void spinUp() {
    front.set(1);
    back.set(1);
  }

  public void stop() {
    front.stopMotor();
    back.stopMotor();
  }

  @Override
  public void periodic() {

  }
}
