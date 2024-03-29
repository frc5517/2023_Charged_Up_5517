// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.autonomous;

import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.drivetrain.DriveForTime;
import frc.robot.commands.manipulator.LiftArmForTime;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.PinchSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class scoreDoubleReverse extends SequentialCommandGroup {
  /** Creates a new scoreReverse. */
  public scoreDoubleReverse(ArmSubsystem armSubsystem, DriveSubsystem driveSubsystem, PinchSubsystem pinchSubsystem, CommandXboxController drController, double speed, double time, double liftPower, double liftTime, double reverseTime) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());

    // Adds commands to make up the autonomous command
    addCommands(
      new LiftArmForTime(armSubsystem, -liftPower),
      Commands.runOnce(pinchSubsystem::pinchTrue, pinchSubsystem),
      new WaitCommand(1),
      new DriveForTime(driveSubsystem, drController, speed, time, drController),
      new WaitCommand(1),
      new DriveForTime(driveSubsystem, drController, -speed, reverseTime, drController)
    );
  }
}
