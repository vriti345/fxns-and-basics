package com.company;

import java.util.Scanner;

public class different_sums_a {
    public static void main(String[] args) {
        int spe=0;
        int spo=0;
        int sn=0;
        while(true){
            System.out.println("enter a num");
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            if(n!=0){
                if(n>0){
                    if(n%2==0){
                        spe=spe+n;
                    }
                    else{
                        spo=spo+n;
                    }
                }
                else{
                    sn=sn+n;
                }
            }
            else{
                break;
            }
        }
        System.out.println("the sum of positive odd nos is "+spo);
        System.out.println("the sum of positive even nos is "+spe);
        System.out.println("the sum of negative nos is "+sn);
    }
}
