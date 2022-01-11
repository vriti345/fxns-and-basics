package com.company;

import java.util.Scanner;

public class prime_check_a {
    public static void main(String[] args) {
        System.out.println("enter a num");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int s=0;
        if(n==1){
            System.out.println("neither prime nor composite");
        }
        else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    s = s + i;
                }
            }
            if (s == n + 1) {
                System.out.println("the num is prime");
            } else {
                System.out.println("the num is composite");
            }
        }
    }
}


