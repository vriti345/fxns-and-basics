package com.company;

import java.util.Scanner;

public class fibonacci_nos_a {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println("enter no of terms: ");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        if(n==1){
            System.out.println(a);
        }
        else if(n==2){
            System.out.println(a+" "+b);
        }
        else if(n>=3){
            System.out.print(a+" "+b+" ");
            for (int i = 1; i <= n - 2; i++) {
                int temp = a + b;
                a= b;
                b = temp;
                System.out.print(temp + " ");
            }
        }
        else{
            System.out.println("0 terms can't be printed");
        }
    }
}






