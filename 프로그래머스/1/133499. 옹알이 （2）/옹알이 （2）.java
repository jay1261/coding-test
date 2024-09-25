import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(int i = 0 ; i < babbling.length; i++){
            for(int j = 0; j < 4; j++){
                if(babbling[i].contains(words[j]+words[j])){
                    babbling[i] = "x";
                }
            }
            System.out.println(Arrays.toString(babbling));
            for(int j = 0; j < 4; j++){
                while(babbling[i].contains(words[j])){
                    babbling[i] = babbling[i].replaceFirst(words[j], " ");
                }
            }
        }
        
        for(int i = 0 ; i < babbling.length; i++){
            if(babbling[i].trim().equals("")){
                answer++;
            }
        }
        
        return answer;
    }
}