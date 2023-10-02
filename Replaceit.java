package com.cp;

import java.util.Scanner;

public class Replaceit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            String ts=sc.next();
            char ch='a';
            int c=0;
            for(int i=0;i<ts.length();i++){
                if(ts.charAt(i)==ch)
                    c++;
            }
            if(ts.equals("a"))
                System.out.println(1);
            else if(c!=0)
                System.out.println(-1);
            else
                System.out.println((long)Math.pow(2 , s.length()));
        }
    }
}
/*to ab isme hai kya ki agr t vaali string mein sirf ek hi one hua to vo s same hi rahega chahe jaha pe t ko rakh to answer hoga 1
pr agr ts vaali string mein ek se zyada 1 hue to fir infinite combinations ba skte hai aage to answer -1 hoga
pr agr ts vaali string mein a nahi hai to fir us string ko s string mein hr jaga pe sirf 2 tariko se rakha ja skta hai to answer hoga
2 ki power s ki length*/