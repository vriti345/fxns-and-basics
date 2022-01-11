package com.company;

import java.util.Scanner;

public class upper_lower_vowel_consonant_a {
    public static void main(String[] args) {
        System.out.println("enter a letter:");
        Scanner in = new Scanner(System.in);
        char c = in.next().trim().charAt(0);
        if(c>='a'&&c<='z'){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.println("its a lowercase vowel");
            }
            else{
                System.out.println("its a lowercase consonant");
            }
        }
        else if(c>='A'&&c<='Z'){
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                System.out.println("its an uppercase vowel");
            }
            else{
                System.out.println("its an uppercase consonant");
            }
        }
        else{
            System.out.println("enter a lowercase/uppercase letter pls");
        }
    }
}
