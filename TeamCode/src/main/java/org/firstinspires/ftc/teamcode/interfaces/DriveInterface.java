package org.firstinspires.ftc.teamcode.interfaces;

import com.qualcomm.robotcore.hardware.Gamepad;

public interface DriveInterface {

    /**
     * Drive the robot
     *
     * @param gamepad the gamepad used to drive the robot
     */
    void drive(Gamepad gamepad);

    /**
     * Move the robot forward or backward
     *
     * @param speed    the speed at which the robot moves
     * @param distance the distance the robot moves
     */
    void moveForwardOrBackward(double speed, double distance);

    /**
     * Turn the robot left or right
     *
     * @param speed  the speed at which the robot turns
     * @param angle  the angle at which the robot turns
     */
    void turnLeftOrRight(double speed, double angle);
}
