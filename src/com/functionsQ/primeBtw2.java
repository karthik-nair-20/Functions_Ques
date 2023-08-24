package com.functionsQ;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class primeBtw2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        boolean p  = prime(num);
        System.out.println("enter the first num");
        int num1 = in.nextInt();

        System.out.println("enter the second number");
        int num2 = in.nextInt();

        checkP(num1 , num2);
    }

    static void checkP(int num1, int num2) {
        while(num1<=num2)
        {
            if (prime(num1)){
                System.out.println(num1);
            }
                num1++;
        }

    }

    static boolean prime(int a){
        int c=2;
        boolean isPrime = true;
        if (a <=1){
            isPrime = false;
        }
        while(c<=Math.sqrt(a))
        {
         if(a%c ==0){
             isPrime = false;
         }
         c++;
        }
        return isPrime;

    }
}
