package frc.robot;

import edu.wpi.first.math.interpolation.InterpolatingDoubleTreeMap;
import edu.wpi.first.math.util.Units;

public final class Constants {

  public static class DriveConstants {
    public static final int frontLeftID = 1;
    public static final int frontRightID = 2;
    public static final int backRightID = 4;
    public static final int backLeftID = 3;

    public static final double gearing = 34;
    public static final double maxRPM = 100;

    public static final double m_RobotWidth = Units.inchesToMeters(15);

    public static final double maxSpeed = 0.4;
  }

  public static class ShooterConstants {
    public static final int rightLauncherID = 22;
    public static final int leftLauncherID = 21;
    public static final int feedRollerID = 23;

    public static final int solenoidID = 15;

    // Max Speed
    public static final double maxFeedSpeed = 0.4; // 0-1 range
    public static final double maxLaunchSpeed = 0.6; // 0-1 range;


    public static final double targetDistance = 0.0; //feet from robot 

    public static InterpolatingDoubleTreeMap lerp = new InterpolatingDoubleTreeMap(); 

    //key = distance in feets, value = velocity in percentage of max power
    static{
        lerp.put(0.0, 0.0);
        lerp.put(1.0, 0.0);
        lerp.put(2.0, 0.0);
        lerp.put(3.0, 0.0);
        lerp.put(4.0, 0.0);
        lerp.put(5.0, 0.0);
        lerp.put(6.0, 0.0);
        lerp.put(7.0, 0.0);
        lerp.put(8.0, 0.0);
        lerp.put(9.0, 0.0);
        lerp.put(10.0, 0.0);} 

    public static double spedToHit = lerp.get(ShooterConstants.targetDistance); 
  }

  public static class IntakeConstants {
    public static final int frontRollerID = 11;
    public static final int leftIndexerID = 12;
    public static final int rightIndexerID = 13;
    public static final int feederSolenoid = 7;

    // Max Speeds
    public static final double maxIntakeSpeed = 0.8; // 0-1 range;
  }
}
