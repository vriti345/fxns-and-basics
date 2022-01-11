package com.company;

import java.util.Scanner;

public class max_min_3_nos_a {
    public static void main(String[] args) {
        System.out.println("enter 3 nums");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println("max is"+Math.max(c,Math.max(a,b)));
        System.out.println("min is"+Math.min(c,Math.min(a,b)));
    }
}


