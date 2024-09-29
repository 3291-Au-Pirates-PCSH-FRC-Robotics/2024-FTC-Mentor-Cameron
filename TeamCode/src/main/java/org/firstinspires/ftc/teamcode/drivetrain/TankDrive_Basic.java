package org.firstinspires.ftc.teamcode.drivetrain;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.interfaces.DriveInterface;
import org.firstinspires.ftc.teamcode.lib.Motor;

import java.util.ArrayList;

public class TankDrive_Basic  implements DriveInterface {
    private DcMotor leftFrontMotor;
    private DcMotor rightFrontMotor;
    private DcMotor leftBackMotor;
    private DcMotor rightBackMotor;

    public TankDrive_Basic(DcMotor leftFrontMotor, DcMotor rightFrontMotor, DcMotor leftBackMotor, DcMotor rightBackMotor) {
        // Constructor
        this.leftFrontMotor = leftFrontMotor;
        this.rightFrontMotor = rightFrontMotor;
        this.leftBackMotor = leftBackMotor;
        this.rightBackMotor = rightBackMotor;
    }

    public void drive(double leftInput, double rightInput) {
        // Drive the robotTemplateOpMode_Linear
        leftFrontMotor.setPower(leftInput);
        rightFrontMotor.setPower(rightInput);
        leftBackMotor.setPower(leftInput);
        rightBackMotor.setPower(rightInput);
    }

    public void moveForwardOrBackward(double speed, double distance) {
        // Move the robot forward or backward
    }

    public void turnLeftOrRight(double speed, double angle) {
        // Turn the robot left or right
    }
}