import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        for(char c: s.toCharArray()){
            stack.push(c);
            
            if(stack.size() >= 2){
                char a = stack.pop();
                char b = stack.pop();
                if(a != b){
                    stack.push(b);
                    stack.push(a);
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}