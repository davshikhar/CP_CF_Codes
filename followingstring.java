package com.cp;

import java.util.Scanner;
import java.util.ArrayList;
public class followingstring
{
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            // int []a=new int[n];
            ArrayList<Long> arr=new ArrayList<Long>();
            for(int i=0;i<n;i++){
                long j=sc.nextLong();
                arr.add(i,j);
            }
            String s="";
            // ArrayList<Integer> arr=new ArrayList<Integer>(Collections.nCopies(26,0));
            int c[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
            for(int i=0;i<n;i++){
                for(int j=0;j<26;j++){
                    if(c[j]==arr.get(i)){
                        c[j]=c[j]+1;
                        s=s+(char)(97+j);
                        break;
                    }
                }
            }
            System.out.println(s);
        }
    }
}