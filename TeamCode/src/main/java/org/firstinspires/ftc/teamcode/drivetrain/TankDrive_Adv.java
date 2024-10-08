package org.firstinspires.ftc.teamcode.drivetrain;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.interfaces.DriveInterface;
import org.firstinspires.ftc.teamcode.lib.Motor;

import java.util.ArrayList;

public class TankDrive_Adv implements DriveInterface {
    private ArrayList<Motor> motors;
    public TankDrive_Adv(ArrayList<Motor> motorsArg) {
        // Constructor
        motors = motorsArg;
    }

    public void drive(Gamepad gamepad) {
        // Drive the robot
        motors.get(0).getMotor().setPower(gamepad.left_stick_y);
        motors.get(1).getMotor().setPower(gamepad.right_stick_y);
        motors.get(2).getMotor().setPower(gamepad.left_stick_y);
        motors.get(3).getMotor().setPower(gamepad.right_stick_y);
    }

    public void moveForwardOrBackward(double speed, double distance) {
        // Move the robot forward or backward
    }

    public void turnLeftOrRight(double speed, double angle) {
        // Turn the robot left or right
    }
}
