package com.functionsQ;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        primeNo(num);
    }

    static void primeNo(int num) {
        int c=2;
        boolean isPrime = true;
        while(c <= Math.sqrt(num)){
            if(num%c ==0)
            {
//                System.out.println("not prime");
                isPrime = false;
            }
            c++;
        }
        if(isPrime && num >1)
        {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }

    }
}
