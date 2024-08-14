package com.cp;

import java.util.*;

public class str {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            ArrayList<String> myList = new ArrayList<String>(Arrays.asList(s.split("")));
//            System.out.println(myList);
            int n1 = Collections.frequency(myList, "B");
            if (n1 == k) {
                System.out.println("0");
            } else {
                System.out.println("1");
                if (n1 > k) {
                    for (int i = 0; i < n; i++) {
                        if (Objects.equals(myList.get(i), "B")) {
                            n1--;
                        }
                        if (n1 == k) {
                            System.out.println(i + 1 + " " + "A");
                            break;
                        }
                    }
                } else {
                    for (int i = 0; i < n; i++) {
                        if (Objects.equals(myList.get(i), "A")) {
                            n1++;
                        }
                        if (n1 == k) {
                            System.out.println(i + 1 + " " + "B");
                            break;
                        }
                    }
                }
            }
        }
    }
}
