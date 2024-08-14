package com.cp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bulbs {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            ArrayList<Integer> arr=new ArrayList<>(Collections.nCopies(10, 0));
            String s=sc.next();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                int ch1=Character.getNumericValue(ch);
                arr.set(ch1,arr.get(ch1)+1);
            }
            int m=Collections.max(arr);
            if(m==4)
                System.out.println(-1);
            else if(m==3)
                System.out.println(6);
            else
                System.out.println(4);
        }
    }
}
