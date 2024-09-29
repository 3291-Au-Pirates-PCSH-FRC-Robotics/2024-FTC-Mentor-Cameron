package org.firstinspires.ftc.teamcode.interfaces;

public interface DriveInterface {
    /**
     * Drive the robot
     *
     * @param leftInput  the input for the left side of the robot
     * @param rightInput the input for the right side of the robot
     */
    void drive(double leftInput, double rightInput);

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
