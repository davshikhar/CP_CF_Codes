package com.cp;

import java.util.Scanner;

public class prdeletion {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String n=sc.next();
            if(n.indexOf("1")<n.indexOf("7"))
                System.out.println("17");
            else
                System.out.println("71");
        }
    }
//    prime vaali cheez kisi bhi pair ke saath kr skte hai jo hundreed ke andar ho jaise 13,31; 17,71 etc.
}
