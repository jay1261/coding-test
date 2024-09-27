import java.util.*;

class Solution {
    public int solution(String s) {
        int tempIndex = 0;
        int xCount = 0;
        int otherCount = 0;
        char x = ' ';
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            if(xCount == 0 && otherCount == 0){
                x = s.charAt(i);
                xCount++;
            } else if(s.charAt(i) == x){
                xCount++;
            } else {
                otherCount++;
            }
            
            if(xCount == otherCount){
                list.add(s.substring(tempIndex, tempIndex + xCount + otherCount));
                tempIndex = tempIndex + xCount + otherCount;
                xCount = 0;
                otherCount = 0;
            }
        }
        
        if(tempIndex < s.length()){
            list.add(s.substring(tempIndex));
        }
        
        System.out.println(list);

        return list.size();
    }
}