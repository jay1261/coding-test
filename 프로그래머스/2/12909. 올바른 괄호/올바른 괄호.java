import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        boolean answer = true;
        
        for(char c: s.toCharArray()){
            stack.push(c);
            if(stack.size() >= 2){
                char b = stack.pop();
                char a = stack.pop();
                
                if(a != '(' || b  != ')'){
                    stack.push(a);
                    stack.push(b);
                }
            }
        }
        
        // System.out.println("Hello Java");

        return stack.isEmpty();
    }
}