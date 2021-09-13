/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Ihosvany Marquez
 */


package Exercise17;

import java.util.Scanner;

public class Solution17
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        int input = scan.nextInt();

        double ratio = 0;

        if (input == 1) {
            ratio = 0.73;
        } else if (input == 2)
        {
            ratio = 0.66;
        }
        else
        {
            System.out.print("That is not a valid input.");
            System.exit(0);
        }

        System.out.print("How many ounces of alcohol did you have? ");
        int ounces = scan.nextInt();

        if (ounces < 1 || ounces > 9999999)
        {
            System.out.print("That is not a valid input.");
            System.exit(0);
        }

        System.out.print("What is your weight, in pounds? ");
        int weight = scan.nextInt();

        if (weight < 1 || weight > 9999999)
        {
            System.out.print("That is not a valid input.");
            System.exit(0);
        }

        System.out.print("How many hours has it been since your last drink? ");
        int hours = scan.nextInt();

        if (hours < 1 || hours > 9999999)
        {
            System.out.print("That is not a valid input.");
            System.exit(0);
        }

        double BAC = ounces * 5.14 / weight * ratio - 0.015 * hours;
        System.out.println();

        System.out.println("Your BAC is " + BAC);

        if (BAC <= 0.08) {
            System.out.println("It is legal for you to drive");
        } else {
            System.out.println("It is not legal for you to drive");

        }
    }
}
