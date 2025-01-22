class Solution {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        
        int answer = -1;
        for(int i = 0; i < numStr.length(); i++){
            int n = Integer.valueOf(numStr.charAt(i)+"");
            if(n == k){
                answer = i+1;
                break;
            } 
        }
    
        return answer;
    }
}