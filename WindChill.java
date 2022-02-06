package com.bridgelabz;

import java.util.Scanner;

public class WindChill {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit :");
        double temperature = sc.nextDouble();
        System.out.println("Enter wind speed in miles per hour:");
        double windSpeed = sc.nextDouble();
        if (temperature >50) {
            System.out.println ("The temperature you entered is invalid.");
        }else if ((windSpeed < 3) && (windSpeed >120)) {
            System.out.println ("The wind speed you entered is invalid.");
        } else {
            double windChillTemp = 35.74 + 0.6215 * temperature +
                    (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
             System.out.println(windChillTemp); // windchill (F)
        }
    }
}
