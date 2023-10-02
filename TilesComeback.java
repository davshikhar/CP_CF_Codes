package com.cp;

// CHECK OF THE RUNTIME ERROR IN THIS CODE SINCE THIS IS WHAT IT SAYS ON CODEFORCES
//problem number 1851C
import java.util.ArrayList;
import java.util.Scanner;

public class TilesComeback {
    public static void main(String[] args) {
        TilesComeback obj =new TilesComeback();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            System.out.println(obj.can_construct() ? "YES" : "NO");
        }
    }
    boolean can_construct(){
        Scanner re=new Scanner(System.in);
        int n,k;
        n=re.nextInt();
        k=re.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        for(int i=0;i<n;i++)
            arr.add(re.nextInt());
        int l=0,r=0,i,j;
        int k_l = k , k_r = k;
        if(arr.get(0) == arr.get(n-1)){
            k_l = k/2;
            k_r = k-k_l;
        }
        for( i=0; i<n && l < k_l ; i++){
            if(arr.get(i) == arr.get(0))
                l++;
        }
        for( j = n-1;j>=0 && r<k_r ; j--){
            if(arr.get(j) == arr.get(n-1))
                r++;
        }
        return (i-1)<(j+1);
    }
}

