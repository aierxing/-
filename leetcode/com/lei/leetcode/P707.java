package com.lei.leetcode;

/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-06-01 7:27
 */
public class P707 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        P707 p707 = new P707();
        int search = p707.search(nums, 9);
        System.out.println(search);
    }
    public int search(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        while (left<=right){
            int mid = left + (right-left)/2;
            if (nums[mid]==target)return mid;
            else if (nums[mid]<target) left = mid +1;
            else if (nums[mid]>target) right = mid - 1;
        }
        return -1;
    }
}
