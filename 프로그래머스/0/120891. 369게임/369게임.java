class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String str = String.valueOf(order);
        for (int i = 0; i < str.length(); i++){
            int temp = Integer.parseInt(str.charAt(i)+"");
            if (temp != 0 &&temp % 3 == 0){
                answer++;
            }
        }
        System.out.println(str);
        
        return answer;
    }
}