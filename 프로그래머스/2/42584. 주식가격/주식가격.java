import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1,o2) -> Integer.compare(o2[0], o1[0]));
        int[] answer = new int[prices.length];
        
        int count = 1;
        int previousPrice = prices[0]; // 바로 이전값
        queue.offer(new int[]{prices[0], 0});
        
        for(int i = 1; i < prices.length; i++){
            // for(int[] arr: queue){
            //     System.out.print(Arrays.toString(arr) + ", ");
            // }
            // System.out.println("- previous: " + previousPrice +  ", now: " + prices[i]);
            
            
            // 바로 전에 비해서 값이 떨어진 경우
            if(previousPrice > prices[i]){
                while(!queue.isEmpty()){
                    int[] element = queue.poll();
                    // System.out.println(Arrays.toString(element));
                    if(element[0] > prices[i]){
                        answer[element[1]] = count - element[1];
                    } else {
                        queue.offer(element);
                        break;
                    }
                }
            }
            
            queue.offer(new int[]{prices[i], i});
            previousPrice = prices[i];
            count++;
        }
        
        while(!queue.isEmpty()){
            int[] element = queue.poll();
            answer[element[1]] = count - element[1] -1;
        }
        
        return answer;
    }
}

// 1 2 3 2 3

// 0 1 2 
// 
// 



// 4 3 2 5 6
// {1 1 2 1 0}