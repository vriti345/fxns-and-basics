package com.company;

import java.util.Scanner;

public class factorial_a{
    public static void main(String[] args) {
        System.out.println("enter a no.");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        factorial(n);
        System.out.println("the factorial of "+n+" is "+factorial(n));

    }
    static int factorial(int n){
        int f;
        if(n==0 || n==1){
            f=1;
        }
        else{
            f=n*factorial(n-1);
        }
        return f;
    }
}
