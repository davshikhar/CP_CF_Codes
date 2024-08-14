package com.cp;

import java.util.Scanner;

public class trickytemplate {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            String c=sc.next();
            int c2=0;
            for(int i=0;i<n;i++){
                if(a.charAt(i)!=c.charAt(i) && b.charAt(i)!=c.charAt(i)){
                    c2=1;
                    break;
                }
            }
            if(c2==1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
