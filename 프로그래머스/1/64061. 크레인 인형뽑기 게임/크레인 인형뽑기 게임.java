import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        
        for(int i = 0; i < moves.length; i++){
            int doll = pick(board, moves[i]-1);
            
            if (doll == 0) {
                continue;
            }
            
            if(!stack.isEmpty() && stack.peek() == doll){
                stack.pop();
                answer += 2;
            } else {
                stack.push(doll);
            }
                    
        }      
        
        return answer;
    }
    
    public int pick(int[][] board, int number){
        // 보드의 세로 높이만큼
        int doll = 0;
        for(int i = 0; i < board.length; i++){
            if(board[i][number] != 0){
                doll = board[i][number];
                board[i][number] = 0;
                break;
            }
        }
        return doll;
    }
}