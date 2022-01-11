package com.company;

import java.util.Scanner;

public class sum_till_user_inputs0_a {
    public static void main(String[] args) {
        int s=0;
        while(true){
            System.out.println("enter a num");
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            if(n!=0){
                s=s+n;
            }
            else{
                break;
            }
        }
        System.out.println("the sum of nos entered by u is "+s);
    }
}


