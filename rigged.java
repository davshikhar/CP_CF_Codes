package com.cp;
import java.util.ArrayList;
import java.util.Scanner;

public class rigged {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> s = new ArrayList<>(n);
            ArrayList<Integer> e = new ArrayList<>(n);
            for(int i=0;i<n;i++){
                int j=sc.nextInt();
                int k=sc.nextInt();
                s.add(j);e.add(k);
            }
            int k=e.get(0);
            int j=s.get(0);
            for(int i=1;i<n;i++){
                /*instead of starting with 0th ; 0th index ki value kisi variable mein save kr leneg uske baad usko index number 1 se compare
                        krenge aur fir usko end tak krenge*/
                if((s.get(i)>=j)&&(e.get(i)>=k)) {
                    j=-1;
                    break;
                }
            }
            System.out.println(j);
        }
    }
}
