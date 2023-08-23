package com.functionsQ;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        System.out.println(grade(num));
    }

     static String grade(int a) {
        if( 91<a && a<100){
            return "AA";
        }
        if (81<a && a<90){
            return "AB";
        }
        if(71<a && a<80){
            return "BB";
        }
        if(61<a && a<70){
            return "BC";
        }
        if(50<a && a<60){
            return "CD";
        }
        if(41<a&& a<50){
            return "DD";
        }
        return "Fail";
    }
}
