package com.cp;
//
////try using the biginteger for very large numbers as encountered in the 5th test case of codeforces
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class TPrimes {
//    public static void main(String[] args) {
//        TPrimes obj =new TPrimes();
//        Scanner sc=new Scanner(System.in);
//        Set <Long> a;
//        a=obj.primes();
//        int n=sc.nextInt();
//        sc.nextLine();
//        String s=sc.nextLine();
//        String de=" ";
//        String[] temp = s.split(de);
//        for(int i=0;i<n;i++){
//            if(a.contains((long)Integer.parseInt(temp[i]))){
//                System.out.println("YES");
//            }
//            else{
//                System.out.println("NO");
//            }
//        }
//    }
//    Set<Long> primes(){
//        int l=1000001;
//        boolean[] arr =new boolean[l];
//        for (int i = 2; i*i < l; i++){
//            if(!arr[i]){
//                for (int j = i*i; j < l; j += i)
//                    arr[j] = true;
//            }
//        }
//        Set<Long> s = new HashSet<Long>();
//        for (int i = 2; i < l; i++){
//            if (!arr[i])
//                s.add((long)i*i);
//        }
//        return s;
//    }
//}
//// how to tackle the problem of very big integer in this T-PRIMES problem
import java.util.*;
import java.util.Scanner;


public class TPrimes {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] ar=new long[n];
        for(int i=0;i<n;i++)ar[i]=sc.nextLong();

        boolean[] prime=new boolean[1000001];
        prime[0]=false;
        prime[1]=false;
        prime[2]=true;
        for(int i=3;i<prime.length;i+=2)
            prime[i]=true;

        for(int i=3;i<prime.length;i+=2){
            if(prime[i]){
                for(int j=3*i;j<prime.length;j+=2*i)
                    prime[j]=false;
            }
        }
        Set<Long> hs=new HashSet<>();
        hs.add(4L);
        for(int i=3;i<prime.length;i=i+2){
            if(prime[i])hs.add((long)i*i);
        }
        for(int i=0;i<n;i++){
            if(hs.contains(ar[i]))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}