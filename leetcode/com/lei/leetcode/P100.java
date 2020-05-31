package com.lei.leetcode;

/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-05-31 8:19
 */
public class P100 {
    public static void main(String[] args) {
        System.out.println("P100");
    }
    public boolean isSameTree(TreeNode p,TreeNode q){
        if (p==null&&q==null)return true;
        if (p==null||q==null)return false;
        return (p.val==q.val)&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
