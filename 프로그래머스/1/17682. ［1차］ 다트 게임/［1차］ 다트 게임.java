class Solution {
    public int solution(String dartResult) {
        int[] scores = {0,0,0};
        int index = -1;
        for(int i = 0; i < dartResult.length(); i++){
            // for문을 돌면서 숫자를 만나면 시작
            if(dartResult.charAt(i) < 'A' && dartResult.charAt(i) > '*'){
                int score = 0;
                // 숫자가 10인 경우 캐릭터로 돌기때문에 따로 처리
                if(dartResult.charAt(i+1) == '0'){
                    score = 10;
                    dartResult = dartResult.replaceFirst("10", "  ");
                } else {
                    score = Integer.valueOf(dartResult.charAt(i)+"");   
                }
                // System.out.println(score);
                scores[++index] = score;
            }
            
            // 더블인 경우
            else if(dartResult.charAt(i) == 'D'){
                scores[index] = scores[index] * scores[index];
            }
            // 트리플인 경우
            else if(dartResult.charAt(i) == 'T'){
                scores[index] = scores[index] * scores[index] * scores[index];
            }
            
            // 스타상
            else if(dartResult.charAt(i) == '*'){
                if(index == 0){
                    scores[index] = scores[index] * 2;
                } else {
                    scores[index-1] = scores[index-1] * 2;
                    scores[index] = scores[index] * 2;
                }
            }
            // 아차상
            else if(dartResult.charAt(i) == '#'){
                scores[index] = scores[index] * -1;
            }
        }
        
        
        int answer = 0;
        for(int i = 0; i < scores.length; i++){
            answer += scores[i];
        }
        return answer;
    }
}