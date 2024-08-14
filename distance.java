package com.cp;

import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        solve();
    }

    static void solve() {
        Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double time = Double.MAX_VALUE;
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                double x1 = sc.nextDouble();
                double y1 = sc.nextDouble();
                double v = sc.nextDouble();
                double dits = dist(a, b, x1, y1);
                double ti = dits / v;
//                System.out.println("ti = "+ti+" distance="+dits);
                if(ti<time){
                    time = ti;
                }
            }
            System.out.println((String.format("%.20f",time)));
        }
        static double dist( double x1, double y1, double x2, double y2){
            return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        }
    }
