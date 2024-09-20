class Solution {
    public int solution(int n) {
               
        StringBuilder sb = new StringBuilder();
        
        int answer = 0;
        
        while(n > 0){
            sb.append(n % 3);
            n /= 3;
        }
        
        char[] cArr = sb.toString().toCharArray();
        int length = cArr.length;
        
        for(int i = 0; i < length; i++){
            answer += ((int)cArr[i] - 48) * Math.pow(3, length - i - 1);
        }
        

        return answer;
    }
}