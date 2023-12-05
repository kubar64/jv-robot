package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if ((robot.getX() - toX) < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        } else if ((robot.getX() - toX) > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        while ((robot.getX() - toX) != 0) {
            robot.stepForward();
        }
        if ((robot.getY() - toY) < 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else if ((robot.getY() - toY) > 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }
        while ((robot.getY() - toY) != 0) {
            robot.stepForward();
        }

    }
}
