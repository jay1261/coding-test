import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Integer, List<String>> map = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++){
            String[] inputs = sc.nextLine().split(" ");
            int age = Integer.valueOf(inputs[0]);
            String name = inputs[1];
            
            List<String> list = map.getOrDefault(age, new ArrayList<String>());
            list.add(name);
            map.put(age, list);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> Integer.compare(o1,o2));
        
        StringBuilder sb = new StringBuilder();
        for(int num: list){
            List<String> sList = map.get(num);
            for(String s: sList){
                sb.append(num).append(" ").append(s).append("\n");
            }
        }
        
        System.out.println(sb);
    }
}