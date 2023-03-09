package Point_MoveablePoint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Point point = new Point();
        System.out.print("Nhập vào x : ");
        float x = input.nextFloat();
        point.setX(x);

        System.out.print("Nhập vào y : ");
        float y = input.nextFloat();
        point.setY(y);

        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.print("Nhập vào xSpeed : ");
        float xSpeed = input.nextFloat();
        moveablePoint.setXSpeed(xSpeed);

        System.out.print("Nhập vào ySpeed : ");
        float ySpeed = input.nextFloat();
        moveablePoint.setYSpeed(ySpeed);

        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
