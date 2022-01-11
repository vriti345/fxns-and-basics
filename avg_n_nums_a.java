package com.company;

import java.util.Scanner;

public class avg_n_nums_a{
    public static void main(String[] args) {
        System.out.println("how many numbers' avg u want?");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int s=0;
        for(int i=1; i<n+1; i++){
            System.out.println("enter "+i+"th num:");
            int num=in.nextInt();
            s=s+num;
        }
        System.out.println("the avg is: "+ s/n);
    }
}

