package com.cp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class place {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            ArrayList<Integer> a= new ArrayList<Integer>(2*n);
            for(int i=0;i<2*n;i++){
                int j=sc.nextInt();
                a.add(i ,j);
            }
            Collections.sort(a);
            int c=0;
            for(int i=0;i<n-1;i++){
                c+=Math.abs(a.get(i+1)-a.get(i))+Math.abs(a.get(n+i+1)-a.get(n+i));
            }
            System.out.println(c);
            for(int i=0;i<n;i++){
                System.out.println(a.get(i)+" "+a.get(n+i));
            }
        }
    }
}
