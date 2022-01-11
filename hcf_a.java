package com.company;

import java.util.Scanner;

public class hcf_a {
    public static void main(String[] args) {
        System.out.println("enter num1 and num2");
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int temp;
        int hcf=1;
        if(num1<num2){
            temp=num1;
        }
        else{
            temp=num2;
        }
        for(int i=1; i<=temp; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("the hcf of 2 nos. is "+hcf);
    }
}


