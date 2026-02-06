// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.shooter.Commands;

import static frc.robot.Constants.ShooterConstants.spedToHit;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.ShooterConstants;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class spedUp extends Command {
  public final double change; 
  /** Creates a new spedUp. */
  public spedUp(double change) {
    this.change = change; 
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    ShooterConstants.spedToHit = spedToHit + change; 
  }

  }

