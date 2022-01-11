package com.company;

import java.util.Scanner;

public class range_prime_nos_a {
    public static void main(String[] args) {
        System.out.println("enter start and end");
        Scanner in=new Scanner(System.in);
        int start=in.nextInt();
        int stop=in.nextInt();
        System.out.print("the prime nos are");
        for(int i=start; i<=stop; i++){
            primecheck(i);
        }
    }

    static void primecheck(int n){
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                s = s + i;
            }
        }
        if (s == n + 1) {
            int ret = n;
            System.out.print(ret + " ");
        }
    }
}

