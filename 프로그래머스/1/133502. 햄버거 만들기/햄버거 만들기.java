import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        // 1. push
        // 2. peek 해서 확인. currentState는 1,2,3,1 의 연속된 상태를 1,2,3,4로 표현
        // 3. currentState 확인 -> 4라면 pop 4번 후 answer++;
        
        for(int i = 0; i < ingredient.length; i++){
            
            stack.push(ingredient[i]);
            
            if(stack.size() >=4 && stack.peek() == 1){
                int a = stack.pop();
                int b = stack.pop();
                int c = stack.pop();
                int d = stack.pop();
                
                if(a == 1 && b == 3 && c == 2 && d == 1){
                    answer++;
                } else {
                    stack.push(d);
                    stack.push(c);
                    stack.push(b);
                    stack.push(a);
                }
            }

        }
        
    
        return answer;
    }
}