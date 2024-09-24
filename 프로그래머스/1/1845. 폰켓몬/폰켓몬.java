import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int maxCount = nums.length / 2;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i]) && count < maxCount){
                map.put(nums[i], 1);
                count++;
            }
        }
        return map.keySet().size();
    }
}