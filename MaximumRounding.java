package com.cp;
import java.util.ArrayList;
import java.util.Scanner;

public class MaximumRounding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int t = sc.nextInt();
        while (t-- > 0) {

            String s = sc.next();
            s = '0' + s;
            int l = s.length();
            int[] a = new int[l];
            for (i = 0; i < l; i++) {
                a[i] = Character.getNumericValue(s.charAt(i));
            }
            for (i = s.length() - 1; i >= 0; i--) {
                if (a[i] >= 5) {
                    a[i - 1]++;
                    l = i;
                }
            }
            for (i = 0; i < s.length(); i++) {
                System.out.print(a[i]);
            }
            for (i = 0; i < s.length(); i++) {
                System.out.print(i >= l ? 0 : a[i]);
            }
            System.out.println();
        }
    }
}
