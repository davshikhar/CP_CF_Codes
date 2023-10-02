package com.cp;
import java.util.Scanner;
public class SequenceGame{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            int n=sc.nextInt();
            int[] a =new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            StringBuilder answer=new StringBuilder();
            answer.append(a[0]).append(" ");
            int previous=a[0];
            int c=1;
            for(int i=1;i<n;i++){
                int next=a[i];
                if(previous<=next){
                    answer.append(next).append(" ");
                    previous=next;
                    c++;
                }
                else{
                    answer.append(next).append(" ").append(next).append(" ");
                    previous=next;
                    c=c+2;
                }
            }
            System.out.println(c);
            System.out.println(answer.toString());
        }
    }
}
