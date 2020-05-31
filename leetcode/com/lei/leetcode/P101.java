package com.lei.leetcode;


/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-05-31 8:05
 */
public class P101 {
    public static void main(String[] args) {
        System.out.println("Hello word!");
    }
    public boolean isSymmetric(TreeNode root){
        return IsMirror(root,root);
    }
    public boolean IsMirror(TreeNode t1,TreeNode t2){
        if (t1==null&&t2==null)return true;
        if (t1==null||t2==null)return false;
        return (t1.val == t2.val)&&IsMirror(t1.left,t2.right)&&IsMirror(t1.right,t2.left);
    }
}


