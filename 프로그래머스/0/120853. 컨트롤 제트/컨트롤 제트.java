class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] splitted = s.split(" ");
        
        int previous = 0;
        for (String str: splitted){
            if (str.equals("Z")){
                answer -= previous;
            }
            else {
                answer += Integer.valueOf(str);
                previous = Integer.valueOf(str);
            }
            
        }
        
        return answer;
    }
}