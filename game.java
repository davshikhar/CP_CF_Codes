package com.cp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve();
        }
    }
    public static void solve(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        ArrayList<Integer> b = new ArrayList<>(m);
        for(int i=0;i<n;i++)
            a.add(sc.nextInt());
        for(int i=0;i<m;i++)
            b.add(sc.nextInt());
        for(int i=0;i<k;i++){
            if(i%2!=0){
                if(Collections.min(a)<Collections.max(b)){
                    int y=a.indexOf(Collections.min(a));
                    int h=b.indexOf(Collections.max(b));
                    int z=Collections.min(a);
                    int e=Collections.max(b);
                    a.set(y , e);
                    b.set(h , z);
                }
            }
            else {
                if(Collections.max(a)>Collections.min(b)){
                    int y=a.indexOf(Collections.min(a));
                    int h=b.indexOf(Collections.max(b));
                    int z=Collections.min(a);
                    int e=Collections.max(b);
                    a.set(y , e);
                    b.set(h , z);
                }
            }
        }
        System.out.println(a.stream().mapToInt(i -> i).sum());
    }
    public static int add(ArrayList<Integer> a){
        int sum=0;
        for(int a1:a){
            sum=sum+a1;
        }
        return sum;
    }
}
