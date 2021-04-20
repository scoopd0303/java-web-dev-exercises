package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea();
    }
    public void calculateArea() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of a circle:");
        try {
            double radius = input.nextDouble();
            while (radius < 0) {
                System.out.println("Must be a positive number.");
                radius = input.nextDouble();
            }
            double area = Circle.getArea(radius);
            System.out.println("the area of the circle is " + area);
        } catch(Exception error) {
            System.out.println("Must be a numeric value.");
        }

    }
}
