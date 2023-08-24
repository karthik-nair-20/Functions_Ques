package com.functionsQ;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();

        int num2 = in.nextInt();

        hcf(num1,num2);
    }

    static void hcf(int a, int b) {
        while(b !=0)
        {
//            int temp = b;
            int r= a % b;
            a = b;
            b = r;
        }
        System.out.println(a);
    }
}
