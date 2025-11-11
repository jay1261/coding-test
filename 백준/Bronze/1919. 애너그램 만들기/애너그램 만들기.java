import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        
        // 맵에다가 첫번째 배열을 다 넣기.
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c : input1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for(char c : input2.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        
        // 두번째배열을 돌면서 맵에 카운트를 하나씩 지움
        int answer = 0;
        for(char c : input2.toCharArray()){
            int count = map1.getOrDefault(c, 0);
            if(count > 0){
                map1.put(c, count-1);
            }
            else {
                answer++;
            }
        }
        
        for(char c : input1.toCharArray()){
            int count = map2.getOrDefault(c, 0);
            if(count > 0){
                map2.put(c, count-1);
            }
            else {
                answer++;
            }
        }
        
        
        System.out.println(answer);
    }
}