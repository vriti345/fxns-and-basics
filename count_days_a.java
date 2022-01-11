package com.company;

public class count_days_a {
    public static void main(String[] args) {
        int count =0;
        for(int i=1; i<=31; i++){
            if(i%2==0){
                count=count+1;
            }
        }
        System.out.println("the no. of days Vriti can go out with friends is "+count);
    }
}

