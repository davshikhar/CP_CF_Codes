package com.cp;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class perfect {
    public static void main(String[] args) {
        getdone();
    }
    static int solve(int n , String[] A){
        int answer=0;
        for(int i=0;i*2<n;i++){
            for(int j=0;j*2<n;j++){
                ArrayList<Character> arr = new ArrayList<Character>(Arrays.asList(A[i].charAt(j), A[n - 1 - j].charAt(i), A[n - 1 - i].charAt(n - 1 - j), A[j].charAt(n - 1 - i)));
                char c = Collections.max(arr);
                for(char e:arr){
                    answer=answer+c-e; 
                }
            }
        }
        return answer;
    }
    static void getdone(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            String []a = new String[n];
            for(int i=0;i<n;i++){
                a[i]=sc.next();
            }
            System.out.println(solve(n , a));
        }
    }
}
//making character arraylist and then storing the four specific characters in it of certain index