package com.lei.leetcode;

import com.sun.org.apache.regexp.internal.REUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-06-04 16:50
 */
public class P20 {
    public static void main(String[] args) {
        System.out.println();

    }
    public boolean isValid(String s){
        int length = s.length();
        if (length==0) return true;
        if (length%2!=0) return false;
        int j = 0;
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i<length;i++){
            char c = s.charAt(i);
            if (c=='('||c=='['||c=='{') stack.push(s.charAt(i));
            else {
                Character character = map.get(c);
                if(stack.isEmpty()) return false;
                Character pop = stack.pop();
                if (pop!=character)return false;
            }
        }
        return stack.isEmpty();
    }
}
