package com.company;

import java.util.Scanner;

public class simple_interest_a {
    public static void main(String[] args) {
        System.out.println("enter principle");
        Scanner p=new Scanner(System.in);
        int principle=p.nextInt();
        System.out.println("enter rate");
        Scanner r=new Scanner(System.in);
        float rate=r.nextFloat();
        System.out.println("enter time");
        Scanner t=new Scanner(System.in);
        int time=t.nextInt();
        System.out.println("the simple interest is "+(principle*rate*time)/100);
    }
}


