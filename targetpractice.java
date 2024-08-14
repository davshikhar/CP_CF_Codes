package com.cp;

import java.util.Scanner;
public class targetpractice{
    public static void main(String [] args ) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int [][]s = {
                {1,1,1,1,1,1,1,1,1,1},
                {1,2,2,2,2,2,2,2,2,1},
                {1,2,3,3,3,3,3,3,2,1},
                {1,2,3,4,4,4,4,3,2,1},
                {1,2,3,4,5,5,4,3,2,1},
                {1,2,3,4,5,5,4,3,2,1},
                {1,2,3,4,4,4,4,3,2,1},
                {1,2,3,3,3,3,3,3,2,1},
                {1,2,2,2,2,2,2,2,2,1},
                {1,1,1,1,1,1,1,1,1,1}
        };
        int t=sc.nextInt();
        char c;
        while(t-->0){
            int a = 0;
            for (int i = 0; i < 10; i++) {
                String s1=sc.next();//hr line ko as a string input karwa lo uske baad usme se ek ek character nikal lo tab compare kro
                for (int j = 0; j < 10; j++) {
                    c=s1.charAt(j);
                    if (c == 'X') {a += s[i][j];}
                }
            }
            System.out.println(a);
        }
    }
}

