package com.functionsQ;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int fact = fact(a);
        System.out.println(fact);
    }

    static int fact(int a) {
        int fact =1;
        while(a>0){
            fact *=a;
            a--;
        }
        return fact;
    }

}
