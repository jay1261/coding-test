class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        int answer = 0;
        int current = n;
        
        while(current > 0){
            if(current % 3 > 10){
                sb.append(current % 3);
            } else {
                sb.append((current % 3));
            }
            current /= 3;
        }
        char[] cArr = sb.toString().toCharArray();
        int length = cArr.length;
        for(int i = 0; i < length; i++){
            answer += ((int)cArr[i] - 48) * Math.pow(3, length - i - 1);
        }
        

        return answer;
    }
}