package com.company;

import java.util.Scanner;

public class count_occurence_a {
    public static void main(String[] args) {
        long n=2367458991102245566l;
        long temp=n;
        System.out.println("enter the number to be searched");
        Scanner inp=new Scanner(System.in);
        int ch=inp.nextInt();
        int count=0;
        for(int i=0; i<10; i++){
            int rem= (int)(temp%10);
            temp=temp/10;
            if(rem==ch){
                count+=1;
            }
        }
        System.out.println("no of times "+ch+" occured in "+n+" is "+count);
    }
}

