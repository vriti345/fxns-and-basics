package com.company;

import java.util.Scanner;

public class perfect_num_a {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int s=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                s=s+i;
            }
        }
        if(s==n){
            System.out.println(n+" is a perfect number");
        }
    }
}

