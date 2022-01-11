package com.company;

import java.util.Scanner;

public class factors_of_num_a {
    public static void main(String[] args) {
        System.out.println("enter a num");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                if(i==n){
                    System.out.print(i+" are the factors of "+n);
                }
                else{
                    System.out.print(i+",");
                }
            }
        }
    }
}

