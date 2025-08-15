package StackP;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String s = "(])";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length() ==1) return false;
        for (int i = 0; i < s.length(); i++) {
            Character peek;
            char c = s.charAt(i);
            if(!stack.isEmpty()){
                switch (c){
                    case ')':
                        peek = stack.peek();
                        if('(' == peek) {
                            stack.pop();
                        } else stack.push(c);
                        break;
                    case '}':
                        peek = stack.peek();
                        if('{' == peek) {
                            stack.pop();
                        } else stack.push(c);
                        break;
                    case ']':
                        peek = stack.peek();
                        if('[' == peek) {
                            stack.pop();
                        }else stack.push(c);
                        break;
                    default: stack.push(c);
                }
            }
            else {
                stack.push(c);
            }
        }

        if(stack.isEmpty()) return true;
        else return false;
    }

}
