package com.cp;

import java.util.ArrayList;
import java.util.Scanner;

public class Noncoprimesplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Noncoprimesplit obj = new Noncoprimesplit();
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int md = 0;
            int c=0;
            for (int i = l; i < r + 1; i++) {
                md = obj.divisor(i);
                if(md!=i){
                    System.out.println(""+md+" "+(i-md));
                    c++;
                    break;
                }
            }if(c==0)
                System.out.println(-1);
        }
    }
    int divisor(int n){
        for (int i=2;i<(Math.round(Math.pow(n,0.5))+1);i++){
            if(n%i==0){
                return i;
            }
        }
        return n;
    }
}
