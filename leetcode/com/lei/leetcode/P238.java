package com.lei.leetcode;

/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-06-04 10:49
 */
public class P238 {
    public int[] productExceptSelf(int[] nums) {
        // 4  5  1  8  2
        // 1  4  20 20 160
        // 80 16 16 2  1

        int length = nums.length;
        int[] L = new int[length];

        int[] result = new int[length];
        //L[i]为索引i右侧所有元素的乘积
        L[0] = 1;
        for (int i = 1;i<length;i++){
            L[i] = nums[i-1]*L[i-1];
        }

        //R[i]为索引i左侧所有元素的乘积
        int R = 1;
        for (int i = length-1;i>=0;i--){
            result[i] = L[i] * R;
            R *= nums[i];
        }

        return result;
    }
}
