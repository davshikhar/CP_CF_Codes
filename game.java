package com.cp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

    }
    public static void solve(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int s=0,s1=0;
        ArrayList<Integer> a = new ArrayList<>(n);
        ArrayList<Integer> b = new ArrayList<>(m);
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        s=s+a.get(i);}
        for(int i=0;i<m;i++){
            b.add(sc.nextInt());
        s1=s1+b.get(i);}
        for(int i=0;i<k;i++){
            if(i%2!=0){
                if(s<=s1){
                    int k1=a.indexOf(Collections.min(a));
                    int x1=a.get(k1);
                    int j=b.indexOf(Collections.max(b));
                    int x2=b.get(j);
                    a.set(k1 , x2);
                    b.set(j , x1);
                    s=add(a);
                    s1=add(b);
                }
            }
        }
    }
    public static int add(ArrayList<Integer> a){
        int sum=0;
        for(int a1:a){
            sum=sum+a1;
        }
        return sum;
    }
}
