package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side1: ");
        double side1 = input.nextDouble();
        System.out.println("Enter side2: ");
        double side2 = input.nextDouble();
        System.out.println("Enter side3: ");
        double side3 = input.nextDouble();
        System.out.println("Enter color of triangle: ");
        String colorTriangle = input.next();
        Triangle triangle = new Triangle(colorTriangle, side1, side2, side3);
        System.out.println(triangle);
    }
}
