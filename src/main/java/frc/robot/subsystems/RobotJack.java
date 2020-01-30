/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
// import frc.robot.Robot;
// import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class RobotJack extends Subsystem {

  public static DoubleSolenoid solenoid1 = new DoubleSolenoid(0, 1);

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  @Override
  public void initDefaultCommand() {

  }

  public void forward() {
    solenoid1.set(DoubleSolenoid.Value.kForward);
  }

  public void reverse() {
    solenoid1.set(DoubleSolenoid.Value.kReverse);
  }

  public void stop() {
    solenoid1.set(DoubleSolenoid.Value.kOff);
  }

}
