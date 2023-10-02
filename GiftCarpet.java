package com.cp;

import java.util.Scanner;
import java.util.ArrayList;
public class GiftCarpet{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int r=sc.nextInt();
            int c=sc.nextInt();
            ArrayList <String> array=new ArrayList<>();
            for(int i=0;i<r;i++){
                array.add(sc.next());
            }
            String VI="vika";
            int in=0;
            int count=0;
            for(int i=0;i<c;i++){
                for(int j=0;j<r;j++){
                    String s=array.get(j);
                    char character=s.charAt(i);
                    if(character==VI.charAt(in)){
                        in++;
                        count++;
                        break;
                    }
                }
                if(count==4)
                    break;
            }

            if(count==4)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
