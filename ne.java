package com.cp;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class ne
{
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String s1="abcdefghijklmnopqrstuvwxyz";
        while(t-->0){
            ArrayList<Integer> arr = new ArrayList<>(Collections.nCopies(26, 0));
//            System.out.println(arr);
             int n =sc.nextInt();
             int k=sc.nextInt();
            String s=sc.next();
            for(int i=0;i<n;i++){
                char ch = s.charAt(i);
                int j = s1.indexOf(ch);
//                System.out.println("ch="+ch+" j="+j);
                int l=arr.get(j);
                int h=l+1;
                 arr.set(j , h);
            }
//             System.out.println(arr);
            int c=0;
            for(int i=0;i<26;i++){
                if(!odd(arr.get(i)))
                    c++;
            }
            if(c<=k+1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
 	static boolean odd(int n){
        return n % 2 == 0;
 	}
}