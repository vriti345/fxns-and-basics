package com.company;

import java.util.Scanner;

public class evenodd_a {
    public static void main(String[] args) {
        System.out.println("enter a no. pls  ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("is even");
        }
        else{
            System.out.println("is odd");
        }
    }
}

