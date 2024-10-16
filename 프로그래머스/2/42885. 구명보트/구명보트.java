import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        
        int answer = 0;
        int front = 0;
        int back = people.length - 1;
        
        while(front <= back){
            if(people[front] + people[back] <= limit){
                answer++;
                front++;
                back--;
                continue;
            }
            
            back--;
            answer++;
        }
        
        return answer;
    }
}


// 50 50 70 80
