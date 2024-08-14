package com.cp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class longes
{
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer> (n);
            for(int i=0;i<n;i++){
                int j=sc.nextInt();
                arr.add(j);
            }
            long sum=0;
            int c=0;
            boolean open = false;
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                int x = arr.get(i);
                sum+=Math.abs(x);
                if(x<0 && (!open)){
                    open = true;
                    c+=1;
                }
                if(x>0){
                    open = false;
                }
            }
            System.out.println(sum+" "+c);
            Collections.sort(arr);
        }
    }
    //ek negative vaale subsequence ke liye ye megative rahega
}