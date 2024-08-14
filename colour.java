package com.cp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class colour {
    public static void main(String[] args) {
        solve();
    }

    static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>(Collections.nCopies(26, 0));
        String s = sc.next();
        String a = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int j = a.indexOf(ch);
            ar.set(j, ar.get(j) + 1);
        }
        int k1 = Collections.max(ar);
        if (k1 > k) {
            System.out.println("NO");
        } else
            System.out.println("YES");
    }
}
