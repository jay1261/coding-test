import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> arrList = new ArrayList<>();
        // 각각 걸리는 일자 구하기
        for(int i = 0; i < progresses.length; i++){
            int days = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0){
                days += 1;
            }
            list.add(days);
        }
        System.out.println(list);

        int sum = 0;
        
        while(!list.isEmpty()){
            sum = list.poll();
            int count = 1;
            while(!list.isEmpty() && list.peek() <= sum){
                list.poll();
                count++;
            }
            arrList.add(count);
        }
        
        
        
        return arrList.stream().mapToInt(i->i).toArray();
    }
}

// 각각 걸리는 일자를 구함
// 7, 3, 9
// 맨앞에서 돌면서 
// 7일째 2개 
// 이때 0 -4 2
// 마지막 9일째 1개 
// 


// 5 10 1 1 20 1

// 0 5 -4 -4 15 -4
// {1}
// 0 -9 -9 10 -9
// {1, 3}
// 0 -19
// {1, 3, 2}


// 7 8 9
// 
