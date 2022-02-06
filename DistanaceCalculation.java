package com.bridgelabz;

import java.util.Scanner;

public class DistanaceCalculation {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter a first integer x:");
//        int x = sc.nextInt();
//        System.out.println("Enter a second integer y:");
//        int y = sc.nextInt();
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double distance = Math.sqrt((Math.pow(x,x)) +(Math.pow(y,y)));
        System.out.println("distance from the point (x, y) to the origin (0, 0) is " + distance);
    }
}
