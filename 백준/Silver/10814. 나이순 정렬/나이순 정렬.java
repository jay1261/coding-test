
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String[] splited = sc.nextLine().split(" ");
            int age = Integer.parseInt(splited[0]);
            String name = splited[1];

            ArrayList<String> list = map.getOrDefault(age, new ArrayList<>());
            list.add(splited[1]);
            map.put(age, list);
        }

        ArrayList<Integer> ageList = new ArrayList<>(map.keySet());
        Collections.sort(ageList);

        StringBuilder sb = new StringBuilder();
        for(int age: ageList){
            for(String name: map.get(age)){
                sb.append(age).append(" ").append(name).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}

