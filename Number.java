package com.cp;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y%x!=0)
                System.out.println(0+" "+0);
            else
                System.out.println(1+" "+Math.floorDiv(y,x));
        }
    }
}
