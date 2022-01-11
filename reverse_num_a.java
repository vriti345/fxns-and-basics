package com.company;

import java.util.Scanner;

public class reverse_num_a {
    public static void main(String[] args) {
        System.out.print("enter the num whose rev u want: ");
        Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();

        int len=0;
        int t=1;
        while(t<=n){
            t=t*10;
            len+=1;
        }

        int temp=n;
        double revnum=0;
        for(int i=0; i<len; i++) {
            int rem = temp % 10;
            revnum = revnum + (rem * Math.pow(10,(len-i-1)));
            temp = temp / 10;
            //kk method revnum=revnum*10+rem;
        }
        System.out.println("the reversed num is " + revnum);
    }
}



