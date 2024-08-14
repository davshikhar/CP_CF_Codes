package com.cp;

import java.util.ArrayList;
import java.util.Scanner;

public class stwos {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=1;i<=n;i++){
                int j=sc.nextInt();
                arr.add(j);
            }
            ArrayList<Integer> arr1 = new ArrayList<>();
            for(int i=1;i<n;i++){
                if(i==1||ispower(i)){
                arr1.add(arr.get(i)-arr.get(i-1)+1);}
                else
                    arr1.add(arr.get(i)-arr.get(i-1));
            }
//            System.out.println(arr);
//            System.out.println(arr1);
            int c=0;
            for(int i=0,j=1;i<arr1.size();i++){
                if(j==1){
                    j++;
                    continue;
                }
                else if(!ispower(j) && arr1.get(i)<0){
                    c=-1;
                    break;
                }
                j++;
            }
            if(c==-1)
                System.out.println("NO");
            else{
            System.out.println("YES");}
        }
    }
    //function to check if it is the power of two or not
    static boolean ispower(int n){
        if(n==0)
            return false;
        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }
}
