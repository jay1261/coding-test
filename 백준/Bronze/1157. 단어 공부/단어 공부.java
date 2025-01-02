import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Character,Integer> map = new HashMap<>();

        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            char c = Character.toUpperCase(str.charAt(i));
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        ArrayList<Character> list = new ArrayList<Character>(map.keySet());
        Collections.sort(list, (o1,o2) -> Integer.compare(map.get(o2), map.get(o1)));
        
        if(list.size() == 1){
            System.out.println(list.get(0));
        }
        else if(map.get(list.get(0)).equals(map.get(list.get(1)))){
            System.out.println("?");
        } else {
            System.out.println(list.get(0));
        }
        
        
    }
}