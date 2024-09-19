import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        int[] answer = {};
        for(int i = 0; i < arr.length; i++){
            if(stack.isEmpty() || stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }
        
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}