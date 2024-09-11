import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    public String[] solution(String[] strings, int n) {
        Map<String, String> map = new TreeMap<>();
        Arrays.sort(strings);

        for(String s: strings){
            map.put(s, s.charAt(n)+"");
        }
        
        String[] answer = new String[strings.length];
        AtomicInteger index = new AtomicInteger(0);

        map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue())
            .forEach(i -> answer[index.getAndIncrement()] = i.getKey());
        
                
        return answer;
    }
}