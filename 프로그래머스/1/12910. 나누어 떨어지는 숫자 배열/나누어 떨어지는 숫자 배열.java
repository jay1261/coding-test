import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i: arr){
            if (i % divisor == 0){
                list.add(i);
            }
        }
        
        list.sort(Comparator.naturalOrder());
        if (list.isEmpty()){
            return new int[] {-1};
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}