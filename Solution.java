package com.cp;

//bondchi
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        solve();
    }
    static void solve() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of test cases:");
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            System.out.println("enter the string:");
            String str = sc.nextLine();
            String[] s = str.split(" ");
            int[] a = new int[4];
            for (int i = 0; i < 4; i++)
                a[i] = Integer.parseInt(s[i]);
            int a1 = a[0], a2 = a[1], b1 = a[2], b2 = a[3];
            int answer = 0;
            if ((check(a1, b1) + check(a2, b2)) > 0)
                answer = answer + 1;
            if ((check(a1, b2) + check(a2, b1)) > 0)
                answer = answer + 1;
            if ((check(a2, b1) + check(a1, b2)) > 0)
                answer = answer + 1;
            if ((check(a2, b2) + check(a1, b1)) > 0)
                answer = answer + 1;
            System.out.println(answer);
        }
        }
    static int check(int a1,int a2){
        return Integer.compare(a1, a2);
    }
}

