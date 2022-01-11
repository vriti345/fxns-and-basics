package com.company;

import java.util.Scanner;

public class armstrong_a {
    public static void main(String[] args) {
        System.out.println("enter a num");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int len=0;
        int t=1;
        while(t<=n){
            t=t*10;
            len=len+1;
        }

        int temp=n;
        int s=0;
        for(int i=1; i<=len; i++){
            int r=temp%10;
            temp=temp/10;
            s=s+(int)(Math.pow(r,len));
        }
        if(s==n){
            System.out.println("the number "+n+" is armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}
