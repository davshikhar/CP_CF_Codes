package com.cp;

import java.util.Scanner;
import java.util.Stack;

public class brokenkeyboard {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            Stack<Integer> lowercase = new Stack<>();
            Stack<Integer> uppercase = new Stack<>();
            for(int i=0;i<s.length();i++) {
                if (s.charAt(i) == 'b') {
                    s = s.substring(0, i)
                            + s.substring(i + 1);
                    if (!lowercase.empty()) {
                        int h=lowercase.pop();
                        s = s.substring(0, h) + '.'
                                + s.substring( h+1);
                    }
                    continue;
                }
                if (s.charAt(i) == 'B') {
                    s = s.substring(0, i) + '.'
                            + s.substring(i + 1);
                    if (!uppercase.empty()) {
                        int h=uppercase.pop();
                        s = s.substring(0, h) + '.'
                                + s.substring( h+1);
                    }
                    continue;
                }
                char ch = s.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    lowercase.push(i);
                } else if (ch >= 'A' && ch <= 'Z')
                    uppercase.push(i);
            }
            System.out.println(s.replace(".",""));
        }
    }
}
