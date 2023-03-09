package Point_B2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Point2D point2D = new Point2D();
        System.out.print("Nhập vào x : ");
        float x = input.nextFloat();
        point2D.setX(x);

        System.out.print("Nhập vào y : ");
        float y = input.nextFloat();
        point2D.setY(y);

        System.out.println(point2D);
        point2D.setXY(100,587);
        System.out.println(point2D);

        Point3D point3D = new Point3D();

        System.out.print("Nhập vào x1 : ");
        float x1 = input.nextFloat();
        point3D.setX(x1);

        System.out.print("Nhập vào y1 : ");
        float y1 = input.nextFloat();
        point3D.setY(y1);


        System.out.print("Nhập vào z : ");
        float z = input.nextFloat();
        point3D.setZ(z);

        System.out.println(point3D);

    }
}
