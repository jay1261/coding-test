import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = citations.length;
        // System.out.println(Arrays.toString(citations));

        for(int c: citations){
            if(c >= answer){
                break;
            }else{
                answer -= 1;
            }
        }
        return answer;
    }        
    
}

// 0 1 3 5 6
// 0 0 0 1 5

// 1 1 1 1 5 5 5 5