import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        HashSet<String> set = new HashSet<>();
        int[] answer = {0, 0};

    
        
        String before = words[0];
        set.add(words[0]);
        
        for(int i = 1; i < words.length; i++){
            if(2 > words[i].length() || words[i].length() > 50){
                answer = new int[]{(i/n)%n +1, i/n +1};
                break;
            }
            if(before.charAt(before.length()-1) != words[i].charAt(0)){
                // System.out.println(words[i]);
                answer = new int[]{(i % n) +1, i/n +1};
                break;
            }
            if(!set.add(words[i])){
                // System.out.println(words[i]);
                answer = new int[]{(i % n) +1, i/n +1};
                break;
            }
            
            before = words[i];
        }
        return answer;
    }
}