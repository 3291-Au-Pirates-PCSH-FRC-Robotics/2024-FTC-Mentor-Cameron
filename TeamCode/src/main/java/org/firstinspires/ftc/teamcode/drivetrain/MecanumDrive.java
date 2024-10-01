package org.firstinspires.ftc.teamcode.drivetrain;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.interfaces.DriveInterface;

public class MecanumDrive implements DriveInterface {
    public MecanumDrive() {
        // Constructor
    }

    public void drive(Gamepad gamepad) {
        // Drive the robot
    }

    public void moveForwardOrBackward(double speed, double distance) {
        // Move the robot forward or backward
    }

    public void turnLeftOrRight(double speed, double angle) {
        // Turn the robot left or right
    }
}
