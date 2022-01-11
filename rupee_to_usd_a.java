package com.company;

import java.util.Scanner;

public class rupee_to_usd_a {
    public static void main(String[] args) {
        //1 rupee=0.013usd
        System.out.println("enter amt in rupees");
        Scanner amt=new Scanner(System.in);
        float amt1=amt.nextFloat();
        System.out.println(amt1+" rupees is equal to "+ (amt1*0.013) +" usd");
    }
}



