// import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        // 97~122
        StringBuilder answer = new StringBuilder();
        
        for(char c: s.toCharArray()){
            for(int i = 0; i < index; i++){
                c = (char)((int)c + 1);
                if(skip.contains(c+"")){
                    i--;
                }
                if((int)c > 122){
                    c = (char) ((int)c - 26);
                    if(skip.contains(c+"")){
                        i--;
                    }
                }
            }
            answer.append(c);
        }
        System.out.println(answer.toString());

        return answer.toString();
    }
}