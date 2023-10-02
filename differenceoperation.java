package com.cp;

import java.util.ArrayList;
import java.util.Scanner;

public class differenceoperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>(n);
            for(int i=0;i<n;i++)
                arr.add(sc.nextInt());
            boolean check=false;
            int k=arr.get(0);
            for(int i=0;i<n;i++){
                if(arr.get(i)%k==0)
                    check = true;
                else{
                    check=false;
                    break;
                }
            }
            if(check)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
