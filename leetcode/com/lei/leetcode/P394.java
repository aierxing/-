package com.lei.leetcode;

import java.util.Stack;

/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-05-28 15:15
 */
public class P394 {
    public static void main(String[] args) {
        String str = "3[a]2[b[2]c]";
        Stack<String> strings = new Stack<>();
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i) == ']') {

            }else {
                strings.push(""+str.charAt(i));
            }
        }
    }
    public static String decodeString(String s) {

        Stack<String> stack=new Stack<String>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==']') {
                String string="";
                while(!stack.peek().equals("[")) {
                    string=stack.pop()+string;
                }
                stack.pop();

                String countString="";
                while((!stack.isEmpty())&&(stack.peek().charAt(0)>='0'&&stack.peek().charAt(0)<='9')) {
                    countString=stack.pop()+countString;
                }
                int count=Integer.parseInt(countString);

                String retString="";
                for(int j=0;j<count;j++) {
                    retString=retString+string;
                }
                stack.push(retString);
            }
            else {
                String str=""+s.charAt(i);
                stack.push(str);
            }
        }

        String aaa="";
        while(!stack.isEmpty()) {
            aaa=stack.pop()+aaa;
        }
        return aaa;
    }
}
