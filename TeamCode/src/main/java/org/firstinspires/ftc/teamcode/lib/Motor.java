package org.firstinspires.ftc.teamcode.lib;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Motor {
    private DcMotor motor;
    private DcMotorSimple.Direction direction;
    private String position;
    private double CPR;
    private double movementInInches;
    private double movementPerDegree;

    /**
     * Constructor for the Motor class.
     * @param motor The motor object.
     * @param direction The direction of the motor.
     * @param position The position of the motor.
     */
    public Motor(DcMotor motor, DcMotorSimple.Direction direction, String position, double CPR) {
        this.motor = motor;
        this.direction = direction;
        this.position = position;
        this.CPR = CPR;

        // Default settings for the motor
        this.motor.setZeroPowerBehavior(Constants.brakeMode);
        this.motor.setMode(Constants.stopAndReset);

        // Calculate the movement in inches and movement per degree for this motor
        movementInInches = CPR / (Constants.WHEELDIAMETER * Math.PI);
        movementPerDegree = ((Constants.ROBOTRADIUS / (Constants.WHEELDIAMETER / 2)) * CPR) / 360;
    }

    /**
     * Returns the motor object.
     */
    public DcMotor getMotor() {
        return motor;
    }

    /**
     * Returns the direction of the motor.
     */
    public DcMotorSimple.Direction getDirection() {
        return direction;
    }

    /**
     * Returns the position of the motor.
     */
    public String getPosition() {
        return position;
    }

    /**
     * Returns the CPR of the motor.
     */
    public double getCPR() {
        return CPR;
    }

    /**
     * Returns the movement in inches of the motor.
     */
    public double getMovementInInches() {
        return movementInInches;
    }

    /**
     * Returns the movement per degree of the motor.
     */
    public double getMovementPerDegree() {
        return movementPerDegree;
    }
}
