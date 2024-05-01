import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(String str: s.split(" ")){
            if (str.equals("Z")){
                stack.pop();
            } else {
                stack.push(Integer.valueOf(str));
            }
        }
        
        for(int i: stack) {
            answer += i;
        }
        
        
        return answer;
        
        
//         int answer = 0;
//         String[] splitted = s.split(" ");
        
//         int previous = 0;
//         for (String str: splitted){
//             if (str.equals("Z")){
//                 answer -= previous;
//             }
//             else {
//                 answer += Integer.valueOf(str);
//                 previous = Integer.valueOf(str);
//             }
            
//         }
        
//         return answer;
    }
}