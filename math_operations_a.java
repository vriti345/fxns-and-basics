package com.company;

import java.util.Scanner;

public class math_operations_a {
    public static void main(String[] args) {
        System.out.println("enter first no");
        Scanner num1=new Scanner(System.in);
        int n1=num1.nextInt();
        System.out.println("enter second no");
        Scanner num2=new Scanner(System.in);
        int n2=num2.nextInt();
        System.out.println("choose your operation +-/*:");
        Scanner op=new Scanner(System.in);
        char oper=op.next().charAt(0);
        if(oper=='+'){
            System.out.println("sum is "+(n1+n2));
        }
        else if(oper=='-'){
            System.out.println("difference is "+(n1-n2));
        }
        else if(oper=='*'){
            System.out.println("product is "+(n1*n2));
        }
        else{
            if(n2!=0){
                System.out.println("quotient is"+n1/n2);
            }
            else{
                System.out.println("the quotient is infinite");
            }
        }
    }
}

