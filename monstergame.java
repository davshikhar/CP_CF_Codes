package com.cp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class monstergame {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextInt();
            long k=sc.nextLong();
            ArrayList<Long> arr = new ArrayList<>((int) n);
            ArrayList<Long> arr1 = new ArrayList<>((int) n);
            ArrayList<Long> arr2 = new ArrayList<>(Collections.nCopies((int)n+1,0L));
            for(int i=0;i<n;i++){
                arr.add(sc.nextLong());
            }
            for(int i=0;i<n;i++){
                arr1.add(sc.nextLong());
            }
            for(int i=0;i<n;i++){
                long j = Math.abs(arr1.get(i));
                long j2 = arr2.get((int) j);
                j2=j2+arr.get(i);
                arr2.set((int) j,j2);
            }
            boolean ok=true;
            long left=0L;
            for(int i=1;i<=n;i++){
                left=left+k-arr2.get(i);
                if(left>=0)
                    ok=true;
                else {
                    ok=false;
                break;}
            }
            System.out.println(ok?"YES":"NO");
        }
    }
}
