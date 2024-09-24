import java.util.*;

class Solution {
    public int solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int maxCount = nums.length / 2;
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(!list.contains(nums[i]) && count < maxCount){
                list.add(nums[i]);
                count++;
            }
        }
        
        return list.size();
        
        
        // Map<Integer,Integer> map = new HashMap<>();
        // int maxCount = nums.length / 2;
        // int count = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(!map.containsKey(nums[i]) && count < maxCount){
        //         map.put(nums[i], 1);
        //         count++;
        //     }
        // }
        // return map.keySet().size();
    }
}