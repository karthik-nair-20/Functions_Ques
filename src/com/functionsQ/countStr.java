package com.functionsQ;

import java.util.Scanner;

public class countStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int count = in.nextInt();

        count(num,count);
    }

    static void count(int num,int count) {
        //to string
        String numS = Integer.toString(num);
        //to character
//        Character numC = Character.forDigit(num,10);
        int numC=0;
        int left = 0;

        while(left < numS.length()){
            if (numS.charAt(left)==Character.forDigit(count,10)){
                numC++;
            }
            left++;
        }
        System.out.println(numC);
    }
}
