class Solution {
    public int solution(int[] numbers, int k) {
        int index = (2*k - 2) % (numbers.length);
        
        return numbers[index];
    }
}