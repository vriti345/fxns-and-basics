package com.company;

import java.util.Scanner;


public class subtract_prosum_digits_a {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        int len=0;
        int t=1;
        while(t<=n){
            t=t*10;
            len=len+1;
        }

        int temp=n;
        int prod=1;
        int sum=0;
        for(int i=1; i<=len; i++){
            int r=temp%10;
            temp=temp/10;
            prod=prod*r;
            sum=sum+r;
        }
        System.out.println("the difference of product "+prod+" and sum "+sum+" of "+n+" is "+(prod-sum));
    }
}


