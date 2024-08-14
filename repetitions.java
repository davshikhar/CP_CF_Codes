package com.cp;
//
//import java.util.Scanner;
//
////cses problems repetitions
//public class repetitions {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.next();
//        char c ='.';
//        int cnt=0,ans=0;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)!=c){
//                c=s.charAt(i);
//                cnt=0;
//            }
//            if(s.charAt(i)==c)
//                cnt++;
//            ans=Math.max(ans,cnt);
//        }
//        System.out.println(ans);
//    }
//}
import java.util.Scanner;
public class repetitions
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String x=sc.next();
            String s=sc.next();
            int c=0;
            String x1=x;
            int i=1;
            boolean q;
            while(true){
                    if(x.length()<=m && x.contains(s)){
                        q=true;
                        break;
                    }
                if(x.length()>m &&(!x.contains(s))){
                    q=false;
                    break;
                }
                        x1 = x1 + x;
                        x = x1;
                        System.out.println("x1="+x1);
                        System.out.println("x="+x);
                        c++;
            }
            if(q)
                System.out.println(c);
            else{
                System.out.println(-1);
            }
        }
    }
}

