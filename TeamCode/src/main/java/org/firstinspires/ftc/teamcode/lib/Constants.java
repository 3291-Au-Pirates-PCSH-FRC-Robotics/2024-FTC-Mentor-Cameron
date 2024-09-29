package org.firstinspires.ftc.teamcode.lib;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Constants {
    public static DcMotor.Direction forward = DcMotor.Direction.FORWARD;
    public static DcMotor.Direction reverse = DcMotor.Direction.REVERSE;

    public static DcMotor.Direction leftDirection = forward;
    public static DcMotor.Direction rightDirection = reverse;

    public static DcMotor.ZeroPowerBehavior brakeMode = DcMotor.ZeroPowerBehavior.BRAKE;
    public static DcMotor.ZeroPowerBehavior zeroPowerBehavior = brakeMode;

    public static DcMotor.RunMode stopAndReset = DcMotor.RunMode.STOP_AND_RESET_ENCODER;
    public static DcMotor.RunMode runToPosition = DcMotor.RunMode.RUN_TO_POSITION;
    public static DcMotor.RunMode runUsingEncoder = DcMotor.RunMode.RUN_USING_ENCODER;

    public static final int DEFAULTINCHES = 1;
    public static final int DEFAULTDEGREE = 1;
    public static final double WHEELDIAMETER = 4;
    public static final double ROBOTRADIUS = 9;

    public static final double STOPPOWER = 0.0;
}
