package com.lei.leetcode;

import sun.security.provider.Sun;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-05-30 10:46
 */
public class P118 {
    public static void main(String[] args) {
        P118 p118 = new P118();
        List<List<Integer>> list = p118.generate(10);
        list.forEach(System.out::println);
    }
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0;i<numRows;i++){
            ArrayList<Integer> sub = new ArrayList<>();
            for (int j = 0;j<=i;j++){
                if (j==0||j==i){
                    sub.add(1);
                }else {
                    sub.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }
            result.add(sub);
        }
        return result;
    }
}
