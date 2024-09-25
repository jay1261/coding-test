import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < win_nums.length; i++){
            list.add(win_nums[i]);
        }
        
        // System.out.println(list.toString());
        int count = 0;
        int zeroCount = 0;
        for(int i = 0; i < lottos.length; i++){
            if(list.contains(lottos[i])){
                count++;
                
            } else if(lottos[i] == 0){
                zeroCount++;
            }
            
        }
        

        
        int[] answer = {getRanking(count), getRanking(count + zeroCount)};
        Arrays.sort(answer);
        return answer;
    }
    
    public int getRanking(int score){
        if (score == 0 || score == 1) {
            return 6;
        } else {
            return 7 - score;
        }
    }
}