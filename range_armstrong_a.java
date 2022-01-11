package com.company;

import java.util.Scanner;

public class range_armstrong_a {
    public static void main(String[] args) {
        System.out.println("enter start and end");
        Scanner in=new Scanner(System.in);
        int start=in.nextInt();
        int stop=in.nextInt();
        System.out.print("the armstrong nos are");
        for(int i=start; i<=stop; i++){
            armcheck(i);
        }
    }

    static void armcheck(int n){

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
            System.out.print(n+" ");
        }
    }
}

