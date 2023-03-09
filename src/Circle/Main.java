package Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Circle circle = new Circle();
        System.out.print("Nhập vào bán kính : ");
        float radiusValue = Float.parseFloat(input.nextLine());
        circle.setRadius(radiusValue);

        System.out.print("Nhập vào màu : ");
        String colorValue = input.nextLine();
        circle.setColor(colorValue);

        circle.calArea();
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.print("Nhập vào bán kính : ");
        float radiusValueCylinder = Float.parseFloat(input.nextLine());
        cylinder.setRadius(radiusValueCylinder);

        System.out.print("Nhập vào màu : ");
        String colorValueCylinder = input.nextLine();
        cylinder.setColor(colorValueCylinder);

        System.out.print("Nhập vào chiều cao : ");
        cylinder.setHeight(Float.parseFloat(input.nextLine()));

        cylinder.calArea();
        cylinder.calVolume();
        System.out.println(cylinder);
    }
}
