package com.functionsQ;

import java.util.Scanner;

public class oodeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a number");
        int num = in.nextInt();

        checkOddEven(num);
    }

     static void checkOddEven(int num) {
        if(num % 2 == 0)
        {
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}
