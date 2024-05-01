class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++){
            int a = my_string.charAt(i);
            if (a < 97) {
                answer += ((char)(a + 32)) + "";
            } else {
                answer += ((char)(a - 32)) + "";
            }
        }
        return answer;
    }
}