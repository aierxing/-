package com.lei.leetcode;

/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-06-05 8:41
 */
public class P29 {
//
//
//
//
    public int[] spiralOrder(int[][] matrix){
        if (matrix.length==0) return new int[0];
        int l = 0,r = matrix[0].length -1,t = 0,b = matrix.length-1,x=0;
        int[] res = new int[(r+1)*(b+1)];
        while (true){
            for (int i = l;i<=r;i++)res[x++]=matrix[t][i];//left to right
            if (++t>b)break;
            for (int i = t;i<=b;i++)res[x++]=matrix[i][r];//top to bottom
            if (--r<l)break;
            for (int i = r;i>=l;i--)res[x++]=matrix[b][i];//right to left
            if (--b<t)break;
            for (int i = b;i>=t;i--)res[x++]=matrix[i][l];//bottom to top
            if (++l>r)break;

        }
        return res;
    }
}
