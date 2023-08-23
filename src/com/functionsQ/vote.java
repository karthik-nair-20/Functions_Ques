package com.functionsQ;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int age = in.nextInt();
        if(ageCheck(age))
        {
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }

     static boolean ageCheck(int num) {
        if(num >=18)
        {
            return true;
        }
        return false;
    }
}
