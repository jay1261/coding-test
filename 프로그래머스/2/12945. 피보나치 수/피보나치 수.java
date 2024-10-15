import java.util.*;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(0);
        list.add(1);
        
        for(int i = 2; i <= n; i++) {
            int num = (list.get(i-1) + list.get(i-2)) % 1234567;
            list.add(num);
        }
        
        return list.get(n);
    }
}