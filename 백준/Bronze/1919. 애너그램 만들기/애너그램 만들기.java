import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        for(char c: word1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for(char c: word2.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        int totalCount = word1.length() + word2.length();

        map1.keySet().retainAll(map2.keySet());
        
        int count = 0;
        ArrayList<Character> list = new ArrayList<>(map1.keySet());
        for(int i = 0; i < list.size(); i++){
            int a = map1.get(list.get(i));
            int b = map2.get(list.get(i));
            
            count += Math.min(a, b) * 2;
        }

        System.out.println(totalCount - count);

    }
}