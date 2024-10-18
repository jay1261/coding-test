import java.util.*;

class Solution {
    public int solution(String s) {
        Queue<Character> queue = new LinkedList<>();
        for(char c: s.toCharArray()){
            queue.offer(c);
        }
        
        int answer = 0;

        for(int i = 0; i < s.length(); i++){
            // System.out.println(queue);
            
            answer += check(queue);
            Character tmp = queue.poll();
            queue.offer(tmp);
        }
        
        return answer;
    }
    
    public int check(Queue<Character> queue){
        Stack<Character> stack = new Stack<>();
        for(Character c : queue){
            stack.push(c);
            if(stack.size() >= 2){
                char a = stack.pop();
                char b = stack.pop();
                
                if((b == '(' && a == ')') || (b == '{' && a == '}') || (b == '[' && a == ']')){
                    continue;
                } 
                stack.push(b);
                stack.push(a);
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}