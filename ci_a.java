package com.company;

import java.util.Scanner;

public class ci_a{
    public static void main(String[] args) {
        System.out.println("enter principle, rate, time, and n");
        Scanner inp=new Scanner(System.in);
        int principle=inp.nextInt();
        float rate=inp.nextFloat();
        int time=inp.nextInt();
        int n=inp.nextInt();
        double prod=Math.pow((1+rate/n),n*time);
        double amt=principle*prod;
        double ci=amt-principle;
        System.out.println("the ci is "+ci);
    }
}
