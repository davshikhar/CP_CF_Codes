package com.cp;

import java.util.Arrays;
import java.util.Scanner;

public class drink {
    public static void main(String[] args) {
        solve();
    }

    static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int q = sc.nextInt();
        int[] m = new int[q];
        for (int i = 0; i < q; i++)
            m[i] = sc.nextInt();
        Arrays.sort(a);
        int c1;
        for (int i = 0; i < q; i++) {
            c1 = bs(a, m[i], n);
            System.out.println(c1);
        }
    }

    //much more efficient binary search used here
    static int bs(int[] arr, int k, int n) {
        int l = -1, r = n;
        while (r - l > 1) {
            int m = (l + r) / 2;
            if (k < arr[m]) {
                r = m;
            } else {
                l = m;
            }
        }
        return l + 1;
    }
}