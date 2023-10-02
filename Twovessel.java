package com.cp;
import java.util.Scanner;

import java.math.BigInteger;

public class Twovessel {
    public static int[] findAB(int l, int r) {
        BigInteger p = BigInteger.valueOf(l - 1).nextProbablePrime();
        int a = p.intValue();
        int b = p.intValue();
        while (a + b < l) {
            a += p.intValue();
            b += p.intValue();
        }
        if (a + b <= r) {
            return new int[]{a, b};
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        int l = 1;
        int r = 4;
        int[] result = findAB(l, r);
        if (result != null) {
            System.out.println("The integers a and b are: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No such integers found");
        }
    }
}

