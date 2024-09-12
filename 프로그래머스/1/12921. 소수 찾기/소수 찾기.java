class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++){
            boolean temp = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    temp = false;
                    // System.out.println("(" + i + "," + j+")");
                    break;
                }
            }
            if (temp){
                // System.out.println(i);
                answer++;
            }
        }
        return answer;
    }
}