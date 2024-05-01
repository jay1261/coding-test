import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int[] distances = new int[array.length];
        
        int min = Math.abs(n - array[0]);;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++){
            int distance = Math.abs(n - array[i]);
            distances[i] = distance;
            if (distance < min){
                min = distance;
                minIndex = i;
            }
        }
        
        return array[minIndex];
    }
}