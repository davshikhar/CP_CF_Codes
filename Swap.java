package com.cp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            ArrayList <Character> arre= new ArrayList<>();
            ArrayList <Character> arro= new ArrayList<>();
            for(int i=0;i<n;i++){
                if(i%2==0){
                    arre.add(s.charAt(i));
                }
                else{
                    arro.add(s.charAt(i));}
            }
            Collections.sort(arre);
            Collections.sort(arro);
            StringBuilder ans= new StringBuilder();
            for(int i=0 , j=0;i<arre.size()||j<arro.size();i++,j++){
                if(i<arre.size())
                    ans.append(arre.get(i));
                if(j<arro.size())
                    ans.append(arro.get(i));
            }
            if(k%2==0){
                char [] array = s.toCharArray();
                Arrays.sort(array);
                s = new String(array);
                System.out.println(s);
                continue;
            }
            System.out.println(ans);
        }
    }
}
