package com.cp;

import java.util.Scanner;

public class aleksa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            for(int i=1;i<2*n;i++){
                if(i%2!=0)
                    System.out.println(i);
            }
        }
    }
}
//Solution : - first n odd natural number nikal kr de do vahi output hoga.
