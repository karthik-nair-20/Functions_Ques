package com.functionsQ;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();

        int num2 = in.nextInt();
        int sum = summ(num1,num2);
        System.out.println(sum);
    }
    static int summ(int a , int b)
    {
        int sum = a +b;
        return sum;

    }
}
