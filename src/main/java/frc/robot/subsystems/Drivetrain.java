// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants.DriveConstants;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.MecanumDrive;

public class Drivetrain extends SubsystemBase {
  /* Motor Controller */
  private final CANSparkMax frontLeftMotor;
  private final CANSparkMax frontRightMotor;
  private final CANSparkMax backLeftMotor;
  private final CANSparkMax backRightMotor;

  /* Encoders */
  private final RelativeEncoder frontLeftEncoder;
  private final RelativeEncoder frontRightEncoder;
  private final RelativeEncoder backLeftEncoder;
  private final RelativeEncoder backRightEncoder;

  /* Drive */
  private final MecanumDrive drive;

  public Drivetrain() {
    frontLeftMotor = new CANSparkMax(DriveConstants.FRONT_LEFT, MotorType.kBrushless);
    frontRightMotor = new CANSparkMax(DriveConstants.FRONT_RIGHT, MotorType.kBrushless);
    backLeftMotor = new CANSparkMax(DriveConstants.BACK_LEFT, MotorType.kBrushless);
    backRightMotor = new CANSparkMax(DriveConstants.BACK_RIGHT, MotorType.kBrushless);

    frontLeftEncoder = frontLeftMotor.getEncoder();
    frontRightEncoder = frontRightMotor.getEncoder();
    backLeftEncoder = backLeftMotor.getEncoder();
    backRightEncoder = backRightMotor.getEncoder();

    drive = new MecanumDrive(frontLeftMotor, backLeftMotor, frontRightMotor, backRightMotor);
  }

  public void cartesianDrive(double xSpeed, double ySpeed, double zRotation) {
    drive.driveCartesian(xSpeed, ySpeed, zRotation);
  }

  @Override
  public void periodic() {
  }
}
