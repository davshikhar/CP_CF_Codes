package com.cp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class stripes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve();
        }
    }
    static void solve() {
        Scanner sc = new Scanner(System.in);
            char[][] a = new char[8][8];
            Set<Integer> ar = new HashSet<>();
            for (int i = 0; i < 8; i++) {
                String s = sc.next();
                for (int j = 0; j < 8; j++) {
                    char ch = s.charAt(j);
                    a[i][j] = ch;
                    if (a[i][j] == 'R') {
                        ar.add(i);
                    }
                }
            }
            ArrayList<Integer> l = new ArrayList<Integer>(ar);
            ar.clear();
            int j = 0;
            boolean st = true;
            for (int i = l.get(j); j < l.size(); j++) {
                for (int j1 = 0; j1 < 8; j1++) {
                    if (a[i][j1] != 'R') {
                        st = false;
                        break;
                    }
                }
                if (st) {
                    System.out.println("R");
                    return;
                }
            }
            System.out.println("B");
    }
}
