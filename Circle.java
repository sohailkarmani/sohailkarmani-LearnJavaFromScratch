//package oops;

import java.util.Scanner;

public class Circle implements Shape {
    public void calculateArea(int c) {
        System.out.println("Area of circle is : " + (Math.PI * c * c));

    }

    public void calculateAreaOfRectangular(int a, int b) {
        System.out.println("Area of Rectangular is : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of circle :");
        int c = sc.nextInt();
        System.out.println("Enter lenght : ");
        int a = sc.nextInt();
        System.out.println("Enter Width :");
        int b = sc.nextInt();
        Shape s = new Circle();
        s.calculateArea(c);
        s.calculateAreaOfRectangular(a, b);
        sc.close();
    }
}