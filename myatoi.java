package com.cp;

import java.util.Scanner;

class myatoi {

    public static void main(String[] args) {
        myatoi obj = new myatoi();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int j = obj.myAtoi(s);
        System.out.println(j);
    }

        public int myAtoi(String s) {
        s = s.toLowerCase();
        String s1 = "0123456789";
        String s4 = "abcdefghijklmnopqrstuvwxyz.";
        int l = s.length();
        String s2 = "";
        int res=0;
        int sign = 1;
        int f = Integer.MAX_VALUE/10;
        if(s.indexOf('-')!=-1)
            sign = -1;
        for (int i = 0; i < l; i++) {
            if (s4.indexOf(s.charAt(i)) != -1) {
                break;
            }
            if(res > f)
                if(sign > 0)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            if (s1.indexOf(s.charAt(i)) != -1) {
                res = res * 10 + (s.charAt(i) - '0');
            }
        }
        return sign*res;
    }
}
