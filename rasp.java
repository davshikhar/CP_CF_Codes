package com.cp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class rasp {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>(n);
            boolean let=false;
            for(int i=0;i<n;i++){
                int j=sc.nextInt();
                arr.add(j);
                if(j==4||j==8){
                    let=true;
                }
            }
            Collections.sort(arr);
            int gh=Integer.MAX_VALUE;
            int c=0;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int l=arr.get(i);
                while(true){
                    if(l%k==0)
                        break;
                    else{
                        l++;
                        c++;
                    }
                }
                min = Math.min(min ,c);
                c=0;
            }
//            System.out.println("min="+min);
            if(k==4){
                int count = evennum(arr);
//                System.out.println("count="+count+" let = "+let);
                gh = (Math.max(0,2-count));
//                System.out.println(gh);
            }
            System.out.println(+Math.min(min,gh));
//            System.out.println(Math.min(gh , min));
        }
    }
    static int evennum(ArrayList<Integer> arr){
        int c=0;
        for(int i=0;i<arr.size();i++){
            if(even(arr.get(i)))
                c++;
        }
        return c;
    }
    static boolean even(int n){
        if(n%2==0)
            return true;
        else
            return false;
    }
}
