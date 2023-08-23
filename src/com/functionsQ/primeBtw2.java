package com.functionsQ;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class primeBtw2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int num2 = in.nextInt();
        prime(num,num2);
    }
    static int prime(int a,int b){

        for(int i=a;i<=b;i++)
        {
            if(b%a == 0){
                return a;
            }
        }
        return 0;
    }
}
