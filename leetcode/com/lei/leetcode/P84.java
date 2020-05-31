package com.lei.leetcode;

/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-05-30 8:41
 */
public class P84 {
    public static void main(String[] args) {
        int[] arr = {2, 1,5,6,2,3};
        P84 p84 = new P84();
        int i = p84.largestRectangleArea(arr);
        System.out.println(i);
    }
    public int largestRectangleArea(int[] heights){
        int res = 0;
        for (int i = 0;i<heights.length;i++){
            int left_i  = i;
            int right_i = i;
            while (left_i > 0 && heights[left_i] >= heights[i]) {
                left_i-=1;
            }
            while (right_i<heights.length && heights[right_i]>=heights[i]) {
                right_i+=1;
            }
            res = Math.max(res,(right_i-left_i+1)*heights[i]);
            System.out.println("左边："+left_i);
            System.out.println("右边："+right_i);
            System.out.println("高度："+heights[i]);
            System.out.println("面积："+(right_i-left_i-1)*heights[i]);
            System.out.println();
        }
        return res;
    }
}
