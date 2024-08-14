package com.cp;

import java.util.ArrayList;
import java.util.Scanner;

public class raspberries {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            ArrayList<Integer> arr  = new ArrayList<Integer>(n);
            int mul=1;
            for(int i=0;i<n;i++){
                arr.add(i , sc.nextInt());
                mul=mul*arr.get(i);
            }
            if(k==2||k==3||k==5){
                if(mul%k==0){
                    System.out.println(0);
                }
//                saare elements pe jaake add krke dekh lenge kitne operations lag rahe divisible banane ke liye
//                aur jo unme se minimum hoga usko print kr denge
                else {
                    System.out.println(numbers(arr , n , k));
                }
            }
            else{
                //minimum print krenge do even nikal ke aur individually operation add krke
                System.out.println(Math.min(numbers(arr , n , k) , Math.max(0,2-count(arr,n))));
            }
        }
    }
    static int numbers(ArrayList<Integer> arr , int n ,int k){
        int c=0;
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            int l=arr.get(j);
            while (true) {
                if(l%k==0)
                    break;
                c++;
                l++;
            }
            min=Math.min(min , c);
            c=0;
        }
        return min;
    }
    static int count(ArrayList<Integer> arr , int n){
        int c=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)%2==0)
                c++;
        }
        return c;
    }
}
