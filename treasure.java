package com.cp;

import java.util.Scanner;

public class treasure {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int k=sc.nextInt();
            int ret;
            if(x<y){
                if(k>=(y-x))
                    ret = y;
                else
                    ret = (x+k)+2*(y-(x+k));
            }
            else{
                ret = x;
            }
            System.out.println(ret);
        }
    }
}
