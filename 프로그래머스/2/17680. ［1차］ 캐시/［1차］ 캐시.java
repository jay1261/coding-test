import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        LinkedList<String> cache = new LinkedList<>();
        int answer = 0;
        
        for(String city: cities){
            city = city.toLowerCase();
            if(cacheSize == 0){
                answer+=5;
                continue;
            }
            
            if(cache.contains(city)){
                answer += 1;
                cache.remove(city);
                cache.addFirst(city);
            } else if(cache.size() < cacheSize){
                cache.addFirst(city);
                answer += 5;
            } else  {
                answer += 5;
                cache.removeLast();
                cache.addFirst(city);
            }
        }
        
        
        return answer;
    }
}


// a b c <- b

// b a c <- d

// d b a <- c




