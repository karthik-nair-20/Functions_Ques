package com.functionsQ;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        palin(num);
    }

    static void palin(int num) {
        //12321
        boolean notP = true;
        String numS = String.valueOf(num);
        int left = 0;
        int right = Integer.toString(num).length() -1;
        while(left <right){
            if(numS.charAt(left) != numS.charAt(right))
            {
                notP = false;
            }
            left++;
            right--;
        }
        if(notP){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
//
    }
}
