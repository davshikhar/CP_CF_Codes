package com.cp;

import java.util.Scanner;

public class eraser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int ops=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='B'){
                    ops++;
                    i=i+(k-1);
                }
            }
            System.out.println(ops);
        }
    }
}
