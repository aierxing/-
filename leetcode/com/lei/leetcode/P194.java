package com.lei.leetcode;

import java.util.Stack;

/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-05-29 8:22
 */
public class P194 {
    public static void main(String[] args) {
        int[] a = {2,3,4,6,9,3,4,2,1};
        P194 p194 = new P194();
        int rob = p194.rob(a);
    }
    /*

     */
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0)return 0;
        int[] dp = new int[len+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2;i<= len;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }
        return dp[len];
    }
}
