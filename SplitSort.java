package com.cp;

//1863B
import java.util.Scanner;

public class SplitSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
                int n;
                n=sc.nextInt();
                int [] p =new int[n];
                for (int i = 0; i < n; i++) {
                    p[i]=sc.nextInt();
                    p[i]--;
                }
                int [] po = new int[n];
                for (int i = 0; i < n; i++) {
                    po[p[i]] = i;
                }
                int nop = 0;
                for (int i = 0; i < n - 1; i++) {
                    if(po[i] > po[i + 1])
                        nop+=1;
                    else
                        nop+=0;
                }
                System.out.println(nop);
        }
    }
}
