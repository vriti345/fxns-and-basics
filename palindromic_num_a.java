package com.company;

import java.util.Scanner;

public class palindromic_num_a{
    public static void main(String[] args) {
        System.out.print("enter the num to be checked: ");
        Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();

        int len=0;
        int t=1;
        while(t<=n){
            t=t*10;
            len+=1;
        }

        int temp=n;
        int revnum=0;
        for(int i=1; i<=len; i++) {
            int rem = temp % 10;
            revnum = revnum + (int)(rem * Math.pow(10,(len-i)));
            temp = temp / 10;
            //kk method revnum=revnum*10+rem;
        }
        if(revnum==n){
            System.out.println("the number "+n+" is palindromic");
        }
        else{
            System.out.println("not plalindromic");
        }
    }
}



