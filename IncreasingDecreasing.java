package com.cp;

import java.util.ArrayList;
import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int n=sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            int c=1;
            for(int i=0;i<n;i++){
                arr.add(y);
                y-=c;
                c++;
            }
            if(arr.get(arr.size()-1)<x)
                System.out.println(-1);
            else{
                System.out.print(x+" ");
                for(int i=arr.size()-2;i>=0;i--)
                    System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
    }
}
