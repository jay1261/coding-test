class Solution {
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        int n = numbers.length;
        // boolean[] visited = new boolean[n];
        
        dfs(numbers, numbers[0], 0, 0, target, n);
        dfs(numbers, -1*numbers[0], 0, 0, target, n);
        
        return answer;
    }
    
    public void dfs(int[] numbers,int num, int depth, int sum, int target,int end){
        sum += num;
        
        if(depth == end-1) {
             if(sum == target){
                answer++;
             }
            return;
        }
        
        dfs(numbers, numbers[depth+1] ,depth+1, sum, target, end);
        dfs(numbers, -1 * numbers[depth+1] ,depth+1, sum, target, end);
    }
}

                          