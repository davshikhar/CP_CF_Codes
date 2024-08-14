package com.cp;

import java.util.ArrayList;
import java.util.Scanner;

public class unit {
    public static void main(String[] args) {
        solve();
    }
    static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>(n);
            for (int i = 0; i < n; i++) {
                int j = sc.nextInt();
                arr.add(i, j);
            }
            int i;
            int j = 0;
            int c2 = 0;
            //pehle yaha pr sum ko >= 0 kiya uske kitne bhi -1 ko 1 mein badal ke
            while (true) {
                if (sum(arr) >= 0)
                    break;
                else {
                    for (i = j; ; i++) {
                        if (arr.get(i) == -1) {
                            c2++;
                            arr.set(i, 1);
                            j = i + 1;
                            break;
                        }
                    }
                }
            }
            //yaha pe check kiya agr product 1 nahi hai to sirf ek hi -1 ko 1 mein change krne ki zarurat thi
            if (product(arr) != 1) {
                for (i = 0; i < arr.size(); i++) {
                    if (arr.get(i) == -1) {
                        c2++;
                        arr.set(i, 1);
                        break;
                    }
                }
            }
            System.out.println(c2);
        }
    }
    static int sum(ArrayList<Integer>  arr){
        int sum=0;
        for (Integer integer : arr) {
            sum = sum + integer;
        }
        return sum;
    }
    static int product(ArrayList<Integer>  arr){
        int prod=1;
        for (Integer integer : arr) {
            prod = prod * integer;
        }
        return prod;
    }
}
