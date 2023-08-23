package com.functionsQ;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter number 1");
        int num1 = in.nextInt();

        System.out.println("enter number 2");
        int num2 = in.nextInt();

        System.out.println("enter number 3");
        int num3 = in.nextInt();

        int max = maximum(num1,num2,num3);
        System.out.println("the maximum is " + max);

        int min = minimum(num1,num2,num3);
        System.out.println("the minimum is " + min);
    }

    static int maximum(int a, int b , int c){

        int max = a;
        if(b > max)
        {
            max = b;
        }
        if (c > max){
            max = c;
        }
        return max;
    }
    static int minimum(int a , int b, int c)
    {
        int min = Math.min(c , Math.min(a,b));

        return min;

    }
}