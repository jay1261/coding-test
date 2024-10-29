import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < bridge_length; i++){
            queue.offer(0);
        }
        
        int answer = 0;
        int index = 0;
        int totalWeight = 0;
        // System.out.println(queue);
        
        while(!queue.isEmpty()){
            // 큐에서 하나 빼주고 카운트 올라가고, 최대무게 빼주고
            totalWeight -= queue.poll();
            answer++;
            if(index >= truck_weights.length) {
                continue;
            }
            // 최대 무게가 안넘으면 차량 들어가고, 무게, 인덱스 늘려주기 
            if(totalWeight + truck_weights[index] <= weight){

                queue.offer(truck_weights[index]);
                totalWeight += truck_weights[index];
                index++;
                // System.out.println(queue);

            } else {// 최대무게 넘으면, 0 추가해주고 끝
                queue.offer(0);
            }
        }
        
        return answer;
    }
}