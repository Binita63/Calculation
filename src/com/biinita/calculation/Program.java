/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biinita.calculation;

import java.util.Scanner;

/**
 *
 * @author Bini
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculation c = new Calculation();
        while (true) {
            System.out.println("1. calculate area");
            System.out.println("2.calculate volume");
            System.out.println("3.exit");
            System.out.println("enter your choice");
            int choice = input.nextInt();
            switch (choice) {
                case 1: {
                    c.getArea();
                    break;
                }
                case 2: {
                    c.getVolume();
                    break;
                }

                case 3: {
                    System.out.println("Do you want to exit?[Y/N]");
                    if (input.next().equalsIgnoreCase("Y")) {
                        System.exit(0);
                        break;
                    }
                }
            }
        }
    }
}
