import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        Arrays.sort(stages);
        // System.out.println(Arrays.toString(stages));
        
        HashMap<Integer, Double> map = new HashMap<>();
        for(int i = 1; i <= N; i++){
            map.put(i, 0.0);
        }
        
        
        double[] rates = new double[N];
        int currentUserStage = 0;
        int currentStageClearedCount = 0;
        int count = 0;
        
        for(int i = 0; i < stages.length; i++){
            // 처음 제일 낮은 유저의 스테이지 담아두기
            if(currentUserStage == 0){
                currentUserStage = stages[i];
                currentStageClearedCount = stages.length;
                count++;
                continue;
            }
            
            if(currentUserStage == stages[i]){
                count++;
            } else {
                // 값이 다를 경우 length - 인덱스 = 스테이지에 도달한 플레이어 수, 이후 count는 클리어 못한 수
                double rate = (double) count / currentStageClearedCount * 100;
                // System.out.println("rate = " + rate + ", count = " + count + ", curStageCC = " + currentStageClearedCount);
                map.put(currentUserStage, rate);
                rates[currentUserStage-1] = rate;
                
                currentUserStage = stages[i];
                currentStageClearedCount = stages.length - i;
                count = 1;
            }
            
            // 끝 인덱스에서도 실행
            if (i == stages.length -1){
                if(currentUserStage > N){
                    break;
                }
                    
                double rate = (double) count / currentStageClearedCount * 100;
                // System.out.println("rate = " + rate + ", count = " + count + ", curStageCC = " + currentStageClearedCount);
                map.put(currentUserStage, rate);
                // rates[currentUserStage-1] = rate;
            }
        }
        
        // System.out.println(Arrays.toString(rates));
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1)));
        
        return keySet.stream().mapToInt(Integer::intValue).toArray();
    }
}