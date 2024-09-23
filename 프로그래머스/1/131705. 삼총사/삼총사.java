class Solution {
    public int solution(int[] number) {
        int answer = 0;
        // 2중 for문
        // 0 부터 n 까지 돌고
        // 내부 for문은 흠...
        for(int i = 0; i < number.length-2; i++){
            for(int j = i+1; j < number.length - 1; j++){
                for(int k = j+1; k < number.length; k++){
                    int sum = number[i] + number[j] + number[k];
                    if (sum == 0){
                        answer++;
                    }
                }
            }
        }
    
        return answer;
    }
}


// -2 3 0 
// -2 3 2
// -2 3 -5
// -2 0 2
// -2 0 -5
// -2 2 -5

// 3 0 2
// 3 0 -5
// 3 2 -5

// 0 2 -5