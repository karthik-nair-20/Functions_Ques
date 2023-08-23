package com.functionsQ;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float rad = in.nextFloat();

        circum(rad);
        area(rad);
    }

     static void area(float rad) {
        double area = Math.PI* rad *rad;
        double round = Math.round(area *10000.0)/10000.0;
         System.out.println(round);
    }

    static void circum(float rad) {
        double circum = 2 * Math.PI * rad;
         System.out.println(circum);
    }
}
