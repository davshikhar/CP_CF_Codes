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
//}
//    public int myAtoi(String s) {
//        if (s == null) return 0;
//        int n = s.length();
//        if (n == 0) return 0;
//        int i = 0;
//        while (s.charAt(i) == ' ') {
//            // only contains blank space
//            if (++i == n) return 0;
//        }
//        int sign = 1;
//        if (s.charAt(i) == '-') sign = -1;
//        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
//            System.out.println("i = " + i);
//            ++i;
//        }
//        int res = 0, flag = Integer.MAX_VALUE / 10;
//        System.out.println(flag);
//        for (; i < n; ++i) {
//            // not a number, exit the loop
//            if (s.charAt(i) < '0' || s.charAt(i) > '9') break;
//            // if overflows
//            if (res > flag || (res == flag && s.charAt(i) > '7')){
//                System.out.println("Yaha khatam hua hai");
//                return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;}
//            res = res * 10 + (s.charAt(i) - '0');
//            System.out.println("res = " + res);
//        }
//        System.out.println("sign = " + sign + " res = " + res);
//        return sign * res;
//    }
}
