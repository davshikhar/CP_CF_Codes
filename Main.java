package com.cp;

//import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countGoodSubstrings(s));
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[10];
            for (int j = i; j < s.length(); j++) {
                int digit = s.charAt(j) - '0';
                freq[digit]++;

                // Check if frequency of the current digit is less than the digit itself
                if (freq[digit] < digit) {
                    count++;
                } else {
                    break; // No need to continue checking, as it won't be a "good substring"
                }
            }
        }
        return count;
    }
}

