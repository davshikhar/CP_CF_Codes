package com.cp;

import java.util.Scanner;
public class diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int q = sc.nextInt();
            String s;
            s = sc.next();
            int c = a;
            for (int i = 0; i < q; i++) {
                if (s.charAt(i) == '+') {
                    c = c + 1;
                }
            }
            boolean tell = false;
            int ne = a;
            if (ne == n)
                tell = true;
            for (int i = 0; i < q; i++) {
                if (s.charAt(i) == '+') {
                    ne = ne + 1;
                } else {
                    ne = ne - 1;
                }
                if (ne == n) {
                    tell = true;
                }
            }
            if (tell) {
                System.out.println("YES");
                continue;
            }
            if (c >= n) {
                System.out.println("MAYBE");
                continue;
            }
            System.out.println("NO");
        }
    }
}
