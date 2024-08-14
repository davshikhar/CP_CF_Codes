package com.cp;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class bait {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>(n);
            for(int i=0;i<n;i++){
                arr.add(i  , sc.nextInt());
            }
            int l=1,r=n;
            while(l<r){
                if(Objects.equals(arr.get(l), arr.get(r))){
                    l++;r--;
                }
                else if(arr.get(l)<arr.get(r)){
                    
                }
            }
        }
    }
}
