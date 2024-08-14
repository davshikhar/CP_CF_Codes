package com.cp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//my first implementation of java map
public class paint {
    public static void main(String[] args) {
        solve();
    }

    static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer , Integer> fmap = new HashMap<>();
            int l=0;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
//                fmap.put(x);
                int c=fmap.get(x);
//                System.out.println("c="+c);
                fmap.put(x , fmap.get(x)+1);
            }
            System.out.println(fmap);
        }
    }
}

