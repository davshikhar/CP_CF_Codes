package com.cp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class sinkship {
    public static void main(String[] args) {
        solve();
    }

    static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        Set<Integer> hash_Set = new HashSet<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        int j = 0;
        String[] s = {"rat", "", "man", "captain"};
        while (j < 4) {
            String s1 = s[j];
            for (int i = 0; i < n; i++) {
                 if(!hash_Set.contains(i)){
                    int ind = arr[i].indexOf(' ')+1;
                    if (j == 1) {
                        if (arr[i].substring(ind).equals("woman") || arr[i].substring(ind).equals("child")) {
                            System.out.println(arr[i].substring(0,ind-1));
                            hash_Set.add(i);
                        }
                    }
                    else {
                        if (arr[i].substring(ind).equals(s1)) {
                            System.out.println(arr[i].substring(0,ind-1));
                            hash_Set.add(i);
                        }
                    }
                }
            }
            j=j+1;
        }
    }
}
