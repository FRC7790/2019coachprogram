/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

// import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

// import frc.robot.Robot;

/**
 * Add your docs here.
 */

public class SolenoidReverseCommand extends Command {

 // public static DoubleSolenoid solenoid1 = new DoubleSolenoid(0, 1);

  public SolenoidReverseCommand() { 
    requires(Robot.jacksubsystem);
  }
  
  protected void execute() {
    Robot.jacksubsystem.reverse();
  }

  protected boolean isFinished() {
    return isTimedOut();
  }

  protected void end() {
    Robot.jacksubsystem.stop();
  }

  protected void interrupted() {
    end();
  }

}
