// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.Cartesian;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in
 * the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of
 * the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {

  private final Drivetrain m_Drivetrain = new Drivetrain();

  private final Joystick joystick1 = new Joystick(Constants.IOConstants.JOYSTICK_1);
  private final Joystick joystick2 = new Joystick(Constants.IOConstants.JOYSTICK_2);

  public RobotContainer() {

    /*
     * Doublesupplier drive
     * 
     * m_Drivetrain.setDefaultCommand(new Cartesian(
     * () -> joystick1.getX(),
     * () -> joystick1.getY(),
     * () -> joystick2.getY(),
     * m_Drivetrain));
     */

    m_Drivetrain.setDefaultCommand(new Cartesian(
        joystick1.getX(),
        joystick1.getY(),
        joystick2.getY(),
        m_Drivetrain));

    configureBindings();
  }

  private void configureBindings() {

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    return null;
  }
}
