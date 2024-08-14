package com.cp;


import java.util.*;
//bondchi
//D.Fast Search
public class Solutionsedu {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr =new ArrayList<>(n);
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        ArrayList<Integer> ar=new ArrayList<>();
        Collections.sort(arr);
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int a=lower(arr,l);
            int b=upper(arr,r);
            ar.add(b-a+1);
//            System.out.println("a="+a+"b="+b);
        }
        for(int i=0;i<ar.size();i++)
            System.out.print(ar.get(i)+" ");
    }
    static int lower(ArrayList<Integer> arr,int x){
        int l=-1,n=arr.size();
        while(n>l+1){
            int m=(l+n)/2;
            if(arr.get(m)>x)
                n=m;
            else
                l=m;
        }
        return l;
    }
    static int upper(ArrayList<Integer> arr,int x){
        int l=-1,n=arr.size();
        while(n>l+1){
            int m=(l+n)/2;
            if(arr.get(m)>=x)
                n=m;
            else
                l=m;
        }
        return n;
    }
}
