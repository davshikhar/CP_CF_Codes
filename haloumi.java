package com.cp;

import java.util.ArrayList;
import java.util.Scanner;

public class haloumi {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>(n);
            for(int i=0;i<n;i++){
                int j=sc.nextInt();
                arr.add(i , j);
            }
            int c=0;
                for(int i=0;i<n-1;i++) {
                    if (k==1 && arr.get(i) > arr.get(i + 1)) {
                        c=-1;
                        break;
                    }
                    else
                        c=1;
                }
                if(c==-1)
                    System.out.println("NO");
                else
                    System.out.println("YES");
        }
    }
}
