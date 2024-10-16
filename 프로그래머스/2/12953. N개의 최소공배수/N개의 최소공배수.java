class Solution {
    public int solution(int[] arr) {
        int lcm = 1;
        for(int i = 0; i < arr.length; i++){
            int gcd = gcd(lcm, arr[i]);
            lcm = (lcm * arr[i]) / gcd;
        }
        
        return lcm;
    }
    
    public int gcd(int a, int b){
        if(a % b == 0){
            return b;
        }
        return gcd(b, a%b);
    }
}