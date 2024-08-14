package com.cp;
import java.util.*;

public class bossele {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j - 1]) {
                nums[j++] = nums[i];
            }
        }

        return j;
    }

    public static void main(String[] args) {
        bossele solution = new bossele();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[10];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int k = solution.removeDuplicates(nums);
        System.out.println("" + k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}