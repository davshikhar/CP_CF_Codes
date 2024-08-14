package com.cp;

import java.util.Scanner;

public class lrremoval {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int [] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            String s=sc.next();
            int x=0,o=n-1;
            for(int i=0;i<s.length();i++) {
                if (i == s.length() - 1)
                    System.out.print(givemod(productarray(a,x,o), m));
                else {
                    System.out.print(givemod(productarray(a,x,o), m) + " ");
                    if (s.charAt(i) == 'L') {
//                        a[x] = -1;
                        x++;
                    } else if (s.charAt(i) == 'R') {
//                        a[o] = -1;
                        o--;
                    }
                }
            }
            System.out.println();
        }
    }
    static int givemod(int x,int n){
        return x%n;
    }
    static int productarray(int []a , int x, int y){
        int produ=1;
        for(int i=x;i<=y;i++){
//            if(a[i]==-1)
//                continue;
            produ=produ*a[i];
        }
        return produ;
    }
}
