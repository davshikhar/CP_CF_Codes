package com.cp;

import java.util.ArrayList;
import java.util.Scanner;

public class maxsum {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>(n);
            for(int i=0;i<n;i++){
                int j=sc.nextInt();
                arr.add(i , j);
            }
            int prev = 0;
            long answer = Long.MIN_VALUE;
            for(int i=1;i<n;i++){
                if((Math.abs(arr.get(i))%2)==(Math.abs(arr.get(i-1))%2)){
                    answer = Math.max(answer , maxSubArraySum(arr , prev , i-1));
                    prev = i;
                }
            }
            answer = Math.max(answer , maxSubArraySum(arr , prev , n-1));
            System.out.println(answer);
        }
    }
    static long maxSubArraySum(ArrayList<Integer> a , int l , int r)
    {
        long max = Long.MIN_VALUE, meh = 0;
        for (int i = l; i <=r; i++) {
            meh = meh + a.get(i);
            if (max < meh)
                max = meh;
            if (meh < 0)
                meh = 0;
        }
        return max;
    }
}
