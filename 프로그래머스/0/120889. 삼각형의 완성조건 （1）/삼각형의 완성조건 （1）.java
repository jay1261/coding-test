import java.util.*;

class Solution {
    public int solution(int[] sides) {
        
        Arrays.sort(sides);
        int rest = sides[0] + sides[1];
        
        return rest > sides[2] ? 1 : 2;
    }
}