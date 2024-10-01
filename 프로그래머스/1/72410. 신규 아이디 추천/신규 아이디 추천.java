import java.util.*;

class Solution {
    public String solution(String new_id) {
        // LinkedList 세팅
        LinkedList<Character> list = new LinkedList<>();
        for(char c: new_id.toCharArray()){
            list.add(c);
        }
        
        // System.out.println(list.toString());
        
        // new_id 검사
        for(int i = list.size() - 1; i >= 0; i--){
            
            char c = list.get(i);
            // 소문자 or 숫자면 continue 
            if(97 <= (int)c && (int)c <= 122 || 48 <= (int)c && (int)c <= 57){
                continue;
            }
            // 대문자 -> 소문자 //대문자: 65~90 / 소문자: 97~122
            else if(65 <= (int)c && (int)c <= 90){
                list.set(i, Character.toLowerCase(c));
            }
            // -, _, .일 경우.
            else if(c == '-' || c == '_' || c == '.'){
                if(i > 0 && c == '.' && list.get(i-1) == '.'){
                    list.remove(i);
                }
            } 
            // 나머지 경우 제거
            else {
                list.remove(i);
            }    
        }
        
        // 3단계
        for(int i = list.size() - 1; i >= 0; i--){
            char c = list.get(i);

            if(i > 0 && c == '.' && list.get(i-1) == '.'){
                list.remove(i);
            }
        }
        // 4단계
        if(!list.isEmpty() && list.getLast() == '.'){
            list.removeLast();
        } 
        if(!list.isEmpty() && list.get(0) == '.'){
            list.remove(0);
        }
        
        // 5단계
        if(list.isEmpty()){
            list.add('a');
        }
        
        //6단계
        if(list.size() >= 16){
            for(int i = list.size() - 1; i >= 15; i--){
                list.remove(i);
            }
        }
        if(!list.isEmpty() && list.getLast() == '.'){
            list.removeLast();
        } 
        
        // 7단계
        if(list.size() <= 2){
            char c = list.getLast();
            for(int i = list.size(); i < 3; i++){
                list.add(c);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(char c: list){
            sb.append(c);
        }    
        
        
        return sb.toString();
    }
}