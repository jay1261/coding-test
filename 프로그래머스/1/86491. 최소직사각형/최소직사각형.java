import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        ArrayList<Integer> longList = new ArrayList<>();
        ArrayList<Integer> shortList = new ArrayList<>();
        
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                longList.add(sizes[i][1]);
                shortList.add(sizes[i][0]);
            } else {
                longList.add(sizes[i][0]);
                shortList.add(sizes[i][1]);
            }
        }
        
               
        
        return Collections.max(longList) * Collections.max(shortList);
    }
}