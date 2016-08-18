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
public class Calculation {

    Scanner input = new Scanner(System.in);

    public void getArea() {
        System.out.println("enter length");
        int length = input.nextInt();
        System.out.println("enter breadth");
        int breadth = input.nextInt();
        double area = length * breadth;
        System.out.println("Area is :" + area);
        
    }

    public void getVolume() {
        System.out.println("enter length");
        int length = input.nextInt();
        System.out.println("enter breadth");
        int breadth = input.nextInt();
        System.out.println("enter height");
        int height = input.nextInt();
        int volume = length * breadth * height;
        System.out.println("Volume is :" + volume);
    }

}
