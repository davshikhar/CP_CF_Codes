package com.cp;

import java.util.*;

public class goodarray {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            Set<Integer> s = new HashSet<>();
            for(int i=0;i<n;i++){
                int k1=sc.nextInt();
                if(!s.contains(k1)){
                    s.add(k1);
                    map.put(k1 , 1);
                }
                else{
                    map.put(k1 , map.get(k1)+1);
                }
            }
            if(map.size()>=3){
                System.out.println("NO");
            }
            else{
                int c1 = 0;
                Set keys = map.keySet();
                for(Object key: keys){
                    c1 = map.get(key)-c1;
                }
                int c2=Math.abs(c1);
                if(c2<=1||c2==n)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
