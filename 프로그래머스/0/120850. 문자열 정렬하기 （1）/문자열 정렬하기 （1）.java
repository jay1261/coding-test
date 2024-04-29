import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        String reg = "[0-9]";
        
        for(int i = 0; i < my_string.length(); i++){
            String temp = my_string.charAt(i) + "";
            if(temp.matches(reg)){
                list.add(Integer.valueOf(temp));
            }
        }
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        
        Arrays.sort(array);

        
        return array;
    }
}