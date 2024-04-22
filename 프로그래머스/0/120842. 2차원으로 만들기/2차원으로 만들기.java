class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];

        int index = -1;
        for (int i = 0; i < num_list.length; i++){
            if(i % n == 0){
                index++;
            }
            answer[index][i%n] = num_list[i];
        }
        
        return answer;
    }
}