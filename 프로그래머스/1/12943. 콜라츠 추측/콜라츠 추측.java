class Solution {
    public int solution(int num) {
        return collatz(num, 0);
    }
    
    public static int collatz(long n, int count){
        if (n == 1){
            return count;
        } else if (count >= 500){
            return -1;
        }
        else if (n % 2 == 0) {
            return collatz(n / 2, ++count);
        } else {
            return collatz(n * 3 + 1, ++count);
        }
    }
}
  