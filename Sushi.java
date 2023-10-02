package com.cp;

import java.util.Scanner;

public class Sushi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,previous=0,count=0,p=0,answer=0,number;
        n=sc.nextInt();
        for(int i=0;i<n;i++) {
            number=sc.nextInt();
            if(number==previous) {
                count++;
            }
            else {
                p=count;
                count=1;
            }
            previous=number;
            answer=Math.max(answer,2*Math.min(p,count));
        }
        System.out.println(answer);
    }
}
