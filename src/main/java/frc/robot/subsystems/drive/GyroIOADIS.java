// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drive;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj.ADIS16470_IMU;

/** Add your docs here. */
public class GyroIOADIS implements GyroIO {
  ADIS16470_IMU gyro = new ADIS16470_IMU();

  @Override
  public void updateInputs(GyroIOInputs inputs) {
    inputs.connected = gyro.isConnected();
    inputs.yawPosition = new Rotation2d(Math.toRadians(-gyro.getAngle()));
    inputs.yawVelocityRadPerSec = Math.toRadians(gyro.getRate());
  }
}
