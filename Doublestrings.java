package com.cp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Doublestrings {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<String> str = new ArrayList<>();
            Map<String, Integer> mp = new HashMap<String,Integer>();
            for(int i=0;i<n;i++){
                String s=sc.next();
                str.add(s);
                mp.put(s,1);
            }
//            System.out.println(mp);
            for(int i=0;i<n;i++){
                int k=0;
                String s1=str.get(i);
//                System.out.println("s1="+s1);
                for(int j=1;j<s1.length();j++){
                    String p=s1.substring(0,j),s2=s1.substring(j,s1.length()+1-1);
//                    System.out.println("p="+p+" s="+s2);
                    if(mp.containsKey(p)&&mp.containsKey(s2))
                    {k=1;}
                }
                System.out.print(k+"");
            }
            System.out.println();
        }
    }
}
