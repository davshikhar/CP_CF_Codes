package com.cp;
import java.util.Scanner;

public class UNLP {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String v="ae";
        String c="bcd";
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            StringBuilder input1 = new StringBuilder();
            StringBuilder input2 = new StringBuilder();
            input1.append(s);
            input1.reverse();
            // System.out.println(input1);
            StringBuilder s1= new StringBuilder();
            for(int i=0;i<n;){
                if(v.indexOf(input1.charAt(i))!=-1){
                    s1.append(input1.substring(i, i + 2)).append(".");
                    i=i+2;
                    // System.out.println("vowels="+s1);
                }
                else if(c.indexOf(input1.charAt(i))!=-1){
                    s1.append(input1.substring(i, i + 3)).append(".");
                    i=i+3;
                    // System.out.println("consonants="+s1);
                }
            }
            // System.out.println("s1="+s1);
            // String s2="";
            s1 = new StringBuilder(s1.substring(0, s1.length() - 1));
            input2.append(s1);
            input2.reverse();
            System.out.println(input2);
        }
    }
}
