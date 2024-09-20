class Solution {
    public int[] solution(int n, int m) {
        int gcd = n > m ? gcd(n, m) : gcd(m, n);
        int lcm = lcm(n, m, gcd);
        System.out.println(gcd);
        int[] answer = {gcd,lcm};
        return answer;
    }
    
    public int gcd(int a, int b){
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }
    
    public int lcm(int a , int b, int gcd){
        return a * b / gcd;
    }
}