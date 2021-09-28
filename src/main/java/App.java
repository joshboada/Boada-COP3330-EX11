/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Josh Boada
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args )
    {
        System.out.print("How many euros are you exchanging? ");
        Scanner input = new Scanner(System.in);

        double currency= input.nextDouble();
        System.out.print("What is the exchange rate? ");

        double rate = input.nextDouble();
        double conversion = currency*rate;

        System.out.printf("%.2f euros at an exchange rate of %.2f is \n%.2f U.S dollars.",currency,rate, conversion);
    }
}
