package com.cp;

//import java.io.*;
import java.util.Scanner;

class BinarySearch {

    // Returns index of x if it is present in arr[].
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        while (l <= r) {
            int mid = l + (r-l)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) r = mid-1;
            else l = mid+1;
        }

        return l;
    }

    // Driver code
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = { 1, 3, 5, 10};
        int x = 2;
        int result = ob.searchInsert(arr, x);
        System.out.println(result);
    }
}
