package com.cp;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisorChain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            ArrayList<Integer> arr= new ArrayList<>();
            for(int i=1;i<x;i++){
                System.out.println(x+" ");
                if(x%i==0){
                    arr.add(i);
                }
            }
        }
    }
}
