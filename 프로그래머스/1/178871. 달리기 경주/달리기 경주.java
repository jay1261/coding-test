import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }
        
        for(String call: callings){
            int calledRank = map.get(call);
            
            String playerTmp = players[calledRank-1];
            players[calledRank-1] = call;
            players[calledRank] = playerTmp;
            
            map.put(playerTmp, calledRank);
            map.put(call, calledRank -1);
        }
        
        return players;
    }
}