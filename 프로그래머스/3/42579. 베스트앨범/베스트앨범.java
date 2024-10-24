import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> totalPlaysMap = new HashMap<>();
        HashMap<String, HashMap<Integer, Integer>> songsMap = new HashMap<>();
        
        for(int i = 0; i < genres.length; i++){
            String genre = genres[i];
            int play = plays[i];
            
            totalPlaysMap.put(genre, totalPlaysMap.getOrDefault(genre, 0) + play);
            
            HashMap<Integer, Integer> innerMap = songsMap.getOrDefault(genre, new HashMap<Integer, Integer>());
            innerMap.put(i, play);
            songsMap.put(genre, innerMap);
        }
        
        // System.out.println(totalPlaysMap);
        // System.out.println(songsMap);
        
        ArrayList<String> genreList = new ArrayList<>(totalPlaysMap.keySet());
        Collections.sort(genreList, (o1, o2) -> Integer.compare(totalPlaysMap.getOrDefault(o2, 0), totalPlaysMap.getOrDefault(o1, 0)));
        
        
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < genreList.size(); i++){
            String genre = genreList.get(i);
            HashMap<Integer, Integer> innerMap = songsMap.getOrDefault(genre, new HashMap<Integer, Integer>());
            
            ArrayList<Integer> songList = new ArrayList<>(innerMap.keySet());
            Collections.sort(songList, (o1, o2) -> Integer.compare(innerMap.getOrDefault(o2, 0), innerMap.getOrDefault(o1, 0)));
            
            answer.add(songList.get(0));
            if(songList.size() > 1){
                answer.add(songList.get(1));
            }
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}

// 각 장르별 재생수
// 각 노래의 고유 번호
// 장르별 두개