import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        HashMap<String, Integer> reported = new HashMap<>();
        // 요청 중복 제외 
        for(String str: report){
            String[] splited = str.split(" ");
            HashSet<String> set = reportMap.getOrDefault(splited[0], new HashSet<String>());
            set.add(splited[1]);
            reportMap.put(splited[0], set);
        }
        
        // System.out.println(reportMap.toString());
        // 새로운 해쉬맵에 각 유저의 신고당한 횟수 입력
        for(HashSet<String> set: reportMap.values()){
            ArrayList<String> list = new ArrayList<String>(set);
            for(String reportedUser: list){
                reported.put(reportedUser, reported.getOrDefault(reportedUser, 0) + 1);
            }
        }
        
        // System.out.println(reported.toString());
        
        // 정답 도출
        int[] answer = new int[id_list.length];
        for(int i = 0; i < id_list.length; i++){
            HashSet<String> set = reportMap.getOrDefault(id_list[i], new HashSet<>());
            ArrayList<String> list = new ArrayList<String>(set);
            for(String reportedUser: list){
                if(reported.get(reportedUser) >= k){
                    answer[i]++;
                }
            }
        }
        
        
        
        return answer;
    }
}