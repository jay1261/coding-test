import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        s = s.replaceAll("\\},\\{", "*");
        s = s.replaceAll("\\}", "");
        s = s.replaceAll("\\{", "");
        String[] splited = s.split("\\*");
        
        Arrays.sort(splited, (o1, o2) -> (Integer.compare(o1.length(), o2.length())));
        // System.out.println(Arrays.toString(splited));
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        for(String str: splited){
            String[] elements = str.split(",");
            for(String e: elements){
                set.add(Integer.valueOf(e));
            }
        }
        
        // int[] answer = {};
        return set.stream().mapToInt(i->i).toArray();
    }
}