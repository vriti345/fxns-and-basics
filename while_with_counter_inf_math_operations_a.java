package com.company;

import java.util.Scanner;

public class while_with_counter_inf_math_operations_a {
    public static void main(String[] args) {
        int c=0;
        while(c==0){
            int ans=0;
            System.out.println("enter first no");
            Scanner num1=new Scanner(System.in);
            int n1=num1.nextInt();
            System.out.println("enter second no");
            Scanner num2=new Scanner(System.in);
            int n2=num2.nextInt();
            System.out.println("choose your operation +-/* quit:Q/q ");
            Scanner op=new Scanner(System.in);
            char oper=op.next().charAt(0);
            if(oper=='+'){
                ans=(n1+n2);
            }
            else if(oper=='-'){
                ans=(n1-n2);
            }
            else if(oper=='*'){
                ans=(n1*n2);
            }
            else if(oper=='/' && n2!=0) {
                ans = (n1 / n2);
            }
            else if(oper=='q'||oper=='Q'){
                c=1;
            }
            else{
                System.out.println("enter a valid input");
            }
            System.out.println(ans);
        }
    }
}

