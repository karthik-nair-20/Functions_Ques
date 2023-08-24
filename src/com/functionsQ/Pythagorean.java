package com.functionsQ;

import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1st side");
        int a = in.nextInt();

        System.out.println("2nd side");
        int b = in.nextInt();

        System.out.println("3rd side");
        int c = in.nextInt();

        boolean p = pythgor(a,b,c);
        System.out.println(p);

    }

    static boolean pythgor(int a1, int b1, int c1) {
        boolean pytha = false;

        if (Math.pow(a1,2) == Math.pow(b1,2) + Math.pow(c1,2) ||
                Math.pow(b1,2) == Math.pow(a1,2) + Math.pow(c1,2) ||
                Math.pow(c1,2) == Math.pow(b1,2) + Math.pow(a1,2))
        {
            pytha = true;
        }

        return pytha;
    }
}
