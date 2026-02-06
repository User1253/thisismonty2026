// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.shooter.Commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.ShooterConstants;
import frc.robot.subsystems.shooter.Shooter;

public class RunLaunch extends Command {
  private final Shooter shooter;

  public RunLaunch(Shooter shooter) {
    this.shooter = shooter;
    
  }

  @Override
  public void execute() {
    shooter.setLaunch(ShooterConstants.spedToHit);
  }
  @Override
  public void end(boolean interrupted) {    
    shooter.setLaunch(0); 
  }


}