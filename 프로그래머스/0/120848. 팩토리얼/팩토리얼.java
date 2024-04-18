class Solution {
    public int solution(int n) {
        int i = 1;
        while(true){
            n = n / i;
            if (n < 1){
                return i-1;
            }
            i++;
        }
    }
}