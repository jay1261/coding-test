class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        int length = s.length();
        
        while(length > 1){
            StringBuilder sb = new StringBuilder();
            for(char c: s.toCharArray()){
                if(c == '0'){
                    answer[1]++;
                } else {
                    sb.append(c);
                }
            }
            
            int c = sb.length();
            sb = new StringBuilder();
            while(c > 0){
                sb.append(c % 2);
                
                c = c / 2;
            }
            answer[0]++;
            s = sb.toString();
            length = s.length();
        }
        
        
        
        return answer;
    }
}