package com.cp;

import java.util.*;

public class twooutthree {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n1=sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            Set<Integer> s = new HashSet<>();
            for(int i=0;i<n1;i++){
                int k1=sc.nextInt();
                if(!s.contains(k1)){
                    s.add(k1);
                    map.put(k1 , 1);
                }
                else{
                    map.put(k1 , map.get(k1)+1);
                }
            }
            System.out.println(map);
        }
    }
}
