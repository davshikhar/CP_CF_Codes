package com.cp;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n;
            n=sc.nextInt();
            ArrayList<Integer> arr = new ArrayList <Integer> (n);
            ArrayList<Integer> b = new ArrayList <Integer> ();
            ArrayList<Integer> c = new ArrayList <Integer> ();
            for(int i=0;i<n;i++){
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            if(Objects.equals(arr.get(0), arr.get(n - 1)))
                System.out.println(-1);

            else {int n1=arr.indexOf(Collections.max(arr));
            for(int i=0;i<n;i++){
                if(i<n1){
                    b.add(arr.get(i));
                }
                else if(i>=n1){
                    c.add(arr.get(i));
                }
            }
            System.out.println(b.size()+" "+c.size());
            for(int i=0 ; i<b.size(); i++)
                System.out.print(b.get(i)+" ");
            System.out.println();
            for(int i=0;i<c.size();i++)
                System.out.print(c.get(i)+" ");
            System.out.println();
        }
        }
    }
}
/*to yaha pr idea kya hai ki agr x>y hai to fir x jo hai vo y ka divisor nahi hai
lekin agr array ke sare element same hai tab ye condition lag nahi paegi to us case mein -1 print kr denge vrna check kr lenge
vrna kya krenge ki pehle array ko sort ke lenge fir uske maximum element ki FIRST OCCURENCE nikal lenge (kyuki agr same maximum element zyada hue to)
uske baad maximum elemtn ki first occurence tak print denge array B mein aur baaki ke elements array A mein
 */