import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        for(int e: priorities){
            queue.offer(e);
        }
        int answer = 0;
        
        List<Integer> list = new ArrayList<>(queue);
        list.sort((o1,o2)->Integer.compare(o2, o1));
            
        // System.out.println(queue);
        // System.out.println(list);
        int index = 0;
        while(!queue.isEmpty()){
            // 큐에서 뺀 값이 리스트의 맨앞값과 같으면 실행
            
            int element = queue.poll();
            // System.out.println("ele: " + element + ", index: " + index + ", answer: " +  answer + ", location: " + location);
            // System.out.println(queue);
            if(element == list.get(index)){
                // 실행될 때 카운드 +1
                index++;
                answer++;
                // 로케이션이 0 이면서 실행되면 끝
                if(location == 0){
                    return answer;
                } 
                location--;

            } else { // 다르면 뒤에 다시 넣어주기 이 때 로케이션이 0이면 큐 사이즈만큼 해주고
                queue.offer(element);
                if(location == 0){
                    location = queue.size()-1;
                } else {
                    // 0이 아니면 -1 해주기
                    location--;
                }
            }            
        }
        return answer;
    }
}