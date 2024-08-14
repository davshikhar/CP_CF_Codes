package com.cp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ambititous {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            ArrayList<Integer> arr =new ArrayList<>(n);
            for(int i=0;i<n;i++){
                int j=sc.nextInt();
                arr.add(j);
            }
            Collections.sort(arr);
            int min=Integer.MAX_VALUE;
            if(arr.get(0)==0){
                min=0;
            }
            else {
                for(int i=0;i<n;i++){
                    int k=Math.abs(arr.get(i));
                    min = Math.min(min , k);
                }
            }
            System.out.println(min);
    }
}
