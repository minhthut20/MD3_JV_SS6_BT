package Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1 =0, side2 = 0, side3 = 0;

        System.out.print("Nhập vào cạnh số 1 : ");
        side1 = input.nextDouble();

        System.out.print("Nhập vào cạnh số 2 : ");
        side2 = input.nextDouble();
        System.out.print("Nhập vào cạnh số 3 : ");
        side3 = input.nextDouble();

       Triangle triangle = new Triangle(side1,side2,side3);


        System.out.println(triangle.toString());
        System.out.print("Diện tích: " + triangle.getArea());
        System.out.print("Chu vi: " + triangle.getPerimeter());
    }
}
