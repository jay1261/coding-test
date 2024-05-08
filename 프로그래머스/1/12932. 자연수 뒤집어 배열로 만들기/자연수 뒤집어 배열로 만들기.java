class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        String reversed = sb.reverse().toString();
        int[] answer = new int[reversed.length()];
        for(int i = 0 ; i < reversed.length(); i++){
            answer[i] = Integer.parseInt(reversed.charAt(i)+"");
        }
        return answer;
    }
}