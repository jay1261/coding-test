import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> map = new HashMap<>();
        // 오늘 - 개월 -> 오늘 기준 만료되는 날짜 먼저 구해놓기
        
        String[] todays = today.split("\\.");
        String y = todays[0];
        String m = todays[1];
        String d = todays[2];
        int todayDayCount = Integer.valueOf(y) * 336 + Integer.valueOf(m) * 28 + Integer.valueOf(d);       
        
        for(int i = 0; i < terms.length; i++){
            String[] splited = terms[i].split(" ");
            
            int termDayCount = Integer.valueOf(splited[1]) * 28;

            int expiredDayCount = todayDayCount - termDayCount;


            map.put(splited[0], expiredDayCount);
                
        }
        
        // System.out.println(map.toString());
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < privacies.length; i++){
            String[] splited = privacies[i].split(" ");
            String type = splited[1];
            
            String[] targetDate = splited[0].split("\\.");
            int targetYear = Integer.parseInt(targetDate[0]);
            int targetMonth = Integer.parseInt(targetDate[1]);
            int targetDay = Integer.parseInt(targetDate[2]);
            int targetDayCount = targetYear * 336 + targetMonth * 28 + targetDay; // 수집 날짜를 일 수로 변환

            if(map.get(type) >= targetDayCount){
                list.add(i+1);
            }
        }
            
      
        
        return list.stream().mapToInt(i->i).toArray();
    }
}