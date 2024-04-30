import java.util.*;
class Solution { 
    public String solution(String my_string) {
        String answer = "";
        Set<String> set = new LinkedHashSet<>();
        
        for(int i = 0; i < my_string.length(); i++){
            
            set.add(my_string.charAt(i) + "");
        }
         
        return String.join("", set);
    }
}