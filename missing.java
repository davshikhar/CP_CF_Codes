package com.cp;
import java.util.*;
public class missing {
    public static void main(String[] args) {
        int []a={1,2,3,3};
        int []b={2,2,4};
        List<Integer> arr1=new ArrayList<>();
        arr1=sortedArray(a,b);
        System.out.println(arr1);
    }
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> arr = new ArrayList<Integer>();
        int n=a.length;
        int m=b.length;
        int i=0,j=0;
        if(m<n){
            while(i<n){
                while(j<m){
                    System.out.println("i="+i+" j="+j);
                    if(a[i]==b[j]){
                        arr.add(a[i]);
//                        System.out.println("a[i]="+a[i]+" b[j]="+b[j]);
                        System.out.println(arr);
                        i++;
                        j++;
                    }
                    else if(a[i]<b[j]){
//                        System.out.println("a[i]="+a[i]+" b[j]="+b[j]);
                        if(!arr.contains(a[i])){
                        arr.add(a[i]);
                        }
                        System.out.println(arr);
                        i++;
                    }
                    else if(b[j]<a[i]){
//                        System.out.println("a[i]="+a[i]+" b[j]="+b[j]);
                        if(!arr.contains(b[j])){
                            arr.add(b[j]);
                        }
                        System.out.println(arr);
                        j++;
                    }
                }
                arr.add(a[i]);
                i++;
            }
        }
        else if(n<m) {
            while (i < m) {
                while (j < n) {
                    if (b[i] == a[j]) {
                        arr.add(b[i]);
                        i++;
                        j++;
                    } else if (b[i] < a[j]) {
                        arr.add(b[i]);
                        i++;
                    } else if (a[j] < b[i]) {
                        arr.add(a[j]);
                        j++;
                    }
                }
                arr.add(b[i]);
                i++;
            }
        }
        return arr;
    }
}

