/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minutesconversion;

/**
 *
 * @author 111ma
 */
import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input for minutes
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();

        // Convert minutes to hours and days
        double hours = minutes / 60.0;
        double days = minutes / (60.0 * 24);

        // Print the results
        System.out.println(minutes + " minutes equals " + hours + " hours.");
        System.out.println(minutes + " minutes equals " + days + " days.");

        scanner.close();
    }
}

