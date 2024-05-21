import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length <= 1){
            return new int[]{-1};
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: arr){
            list.add(i);
        }
        
        int min = Collections.min(list);
        list.remove(Integer.valueOf(min));
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}