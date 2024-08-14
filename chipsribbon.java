package com.cp;
import java.util.ArrayList;
import java.util.Scanner;

public class chipsribbon {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc1=new Scanner(System.in);
        int t=sc1.nextInt();
        while(t-->0){
            long n1=sc1.nextLong();
            ArrayList<Long>arr1 = new ArrayList<>();
            for(int i=0;i<n1;i++){
                long j=sc1.nextLong();
                arr1.add(i , j);
            }
            long c1=0;
            for(int i=1;i<n1;i++){
                long k = Math.max(0 , arr1.get(i)-arr1.get(i-1));
                c1=c1+k;
            }
            System.out.println(arr1.get(0)-1+c1);
        }
    }
}
