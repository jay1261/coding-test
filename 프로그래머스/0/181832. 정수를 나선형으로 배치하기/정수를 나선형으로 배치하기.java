class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int count = 1;
        int direction = 0;
        int i = 0;
        int j = 0;
        while(count <= n*n) {

            answer[i][j] = count;
            
            if(direction == 0) {
                if(j+1 >= n || answer[i][j+1] != 0) {
                    direction++;
                }
                else {
                    j++;
                }
            }
            
            if(direction == 1) {
                if(i+1 >= n || answer[i+1][j] != 0) {
                    direction++;
                }
                else {
                    i++;
                }
            }
            
            if(direction == 2) {
                if(j-1 < 0 || answer[i][j-1] != 0) {
                    direction++;
                }
                else {
                    j--;
                }
            }
            
            if(direction == 3) {
                if(i-1 < 0 || answer[i-1][j] != 0) {
                    direction = 0;
                    j++;
                }
                else {
                    i--;
                }
            }
            
            count++;
        }
        
        for(int k = 0; k < n; k++){
            for(int q = 0; q < n; q++){
                System.out.print(answer[k][q] + ", ");
            }
            System.out.println("");
        }
        
        
        return answer;
    }
}