package com.cp;

import java.util.Scanner;

public class bomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            long ans = b;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                ans = ans + Math.min(a - 1, x);
            }
            System.out.println(ans);
        }
        //to krna ye hai ki tool tabhi use kro jab timer equal to one ho jae taaki maximum benefit ho aur timer kafi badh jae
    }
}
