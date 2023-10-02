package com.cp;

import java.lang.reflect.Array;
import java.util.*;

public class Buttons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Set<Integer> et = new HashSet<Integer>();
            for(int i=1;i<n;i++){
                int j=i;
                while(j<=n){
                    et.add(j);
                    j=j*2;
                }
            }
            Iterator itr = et.iterator();
            while (itr.hasNext()) {
                System.out.print(itr.next()+" ");
            }
            System.out.println();
        }
    }
}
