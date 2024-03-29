// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class OIConstants {
        public static final int drController = 0;
        public static final int opController = 1;
    }
    public static final class DriveConstants {
        public static final int kRightVictorD0 = 0;
        public static final int kRightVictorID1 = 1;
        public static final int kRightTalonID2 = 2;
        public static final int kLeftVictorID3 = 3;
        public static final int kLeftVictorID4 = 4;
        public static final int kLeftTalonID5 = 5;

        public static final double BEAM_BALANACED_DRIVE_KP = 0.015; // P (Proportional) constant of a PID loop
        public static final double BEAM_BALANCED_GOAL_DEGREES = 0;
        public static final double BEAM_BALANCED_ANGLE_TRESHOLD_DEGREES = 1;
        public static final double BACKWARDS_BALANCING_EXTRA_POWER_MULTIPLIER = 1.35;

    }
    public static final class ManipulatorConstants {
        public static final int liftSpark = 6;
        public static final int extenderSpark = 7;
        public static final int pinchSolenoidForward = 31;
        public static final int pinchSolenoidReverse = 32;
    }
    public static final class VisionConstants {
        public final static String camera = "Camera";
        public final static int conePipe = 0;
        public final static int cubePipe = 1;
    }
}