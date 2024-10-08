package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.drivetrain.TankDrive_Adv;
import org.firstinspires.ftc.teamcode.lib.Motor;

import java.util.ArrayList;
import org.firstinspires.ftc.teamcode.lib.Constants;

@TeleOp(name="Robot 1: Linear OpMode", group="Robot 1")
@Disabled
public class Robot1OpMode_Linear_Adv extends LinearOpMode {
    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    private ArrayList<Motor> motors = new ArrayList<Motor>();
    private TankDrive_Adv tankDrive;

    public Robot1OpMode_Linear_Adv() {
        motors.add(
            new Motor(
                hardwareMap.get(DcMotor.class, "leftFrontMotor"),
                Constants.forward,
                "leftFront",
                    480,
                    4
            )
        );

        motors.add(
            new Motor(
                hardwareMap.get(DcMotor.class, "rightFrontMotor"),
                Constants.reverse,
                "rightFront",
                    480,
                    4
            )
        );

        motors.add(
            new Motor(
                hardwareMap.get(DcMotor.class, "leftBackMotor"),
                Constants.forward,
                "leftBack",
                    480,
                    4
            )
        );

        motors.add(
            new Motor(
                hardwareMap.get(DcMotor.class, "rightBackMotor"),
                Constants.reverse,
                    "rightBack",
                    480,
                    4
            )
        );

        tankDrive = new TankDrive_Adv(motors);
    }

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Wait for the game to start (driver presses START)
        waitForStart();
        runtime.reset();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            tankDrive.drive(gamepad1);

            // Show the elapsed game time and wheel power.
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.update();
        }
    }
}