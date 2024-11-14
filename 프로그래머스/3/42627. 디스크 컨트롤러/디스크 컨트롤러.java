import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (o1,o2) -> Integer.compare(o1[0], o2[0]));
        // System.out.println(Arrays.toString(jobs));
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1,o2) -> Integer.compare(o1[1], o2[1]));
        ArrayList<Integer> resultList = new ArrayList<>();
        int index = 0;
        int timer = 0;
        int currentWork = 0;
        
        
        while(index < jobs.length || !queue.isEmpty()){
            // 큐에 추가
            if(index < jobs.length && jobs[index][0] == timer){
                for(int i = index; i < jobs.length; i++){
                    if(jobs[index][0] == timer){
                        queue.offer(jobs[index++]);
                    } else {
                        break;
                    }
                }
            }
            
            // 작업이 없으면
            if(currentWork <= 0 && !queue.isEmpty()){
                int[] work = queue.poll();
                resultList.add(timer + work[1] - work[0]);
                currentWork = work[1];
            }
            
            currentWork--;
            timer++;
        }
        
        System.out.println(resultList);
        
        int sum = 0;
        for(int num: resultList){
            sum += num;
        }
        
        return sum / resultList.size();
    }
}
