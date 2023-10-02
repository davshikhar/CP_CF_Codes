package com.cp;

import java.util.*;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c1=0;
        int c2=0;
        int c3=0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int n1=sc.nextInt();
            arr.add(n1);
            if(n1==1)
                c1++;
            else if(n1==2)
                c2++;
            else if(n1==3)
                c3++;
        }
//        System.out.println(arr);
        if(c1==0 || c2==0 || c3==0)
            System.out.println(0);
        else {
            int min_value = Arrays.stream(new int[]{c1, c2, c3}).min().getAsInt();
            System.out.println(min_value);
            ArrayList<Integer> arr1= new ArrayList<Integer>();
            Set<Integer> hash_Set = new HashSet<Integer>();
            for (int i = 0; i < min_value; i++) {
                int c=1;
                while(true){
                    for(int a=0;a<n;a++){
                        if(arr.get(a)==c && !hash_Set.contains(a)){
                            arr1.add(a);
                            hash_Set.add(a);
                            break;
                        }
                    }
                    c++;
                    if(c==4)
                        break;
                }
                for(int k=0;k<3;k++){
                    System.out.print(arr1.get(k)+1+" ");
                }
                System.out.println();
                arr1.clear();
            }
        }
    }
}
