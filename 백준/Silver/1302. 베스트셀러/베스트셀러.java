import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            String book = sc.nextLine(); 
            
            map.put(book, map.getOrDefault(book, 0) + 1);
        }
        
        ArrayList<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        Collections.sort(keyList, (o1,o2) -> Integer.compare(map.get(o2), map.get(o1)));
        
        System.out.println(keyList.get(0));
    }
}