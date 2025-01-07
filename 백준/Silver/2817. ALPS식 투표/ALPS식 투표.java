import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        int x = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            String[] splited = sc.nextLine().split(" ");
            int score = Integer.parseInt(splited[1]);
            if(score < (double)x * 0.05){
                continue;
            }
            map.put(splited[0].charAt(0), score);
        }

        if(map.isEmpty()){
            return;
        }

        Node[] scores = new Node[map.size()*14];
        int index = 0;
        for(char name: map.keySet()){
            for(int j = 1; j <= 14; j++){
                double score = (double)map.get(name) / j;
                scores[index++] = new Node(name, score);
            }
        }

        Arrays.sort(scores, (o1,o2) -> Double.compare(o2.score, o1.score));
        for (Character c : map.keySet()) {
            map.put(c, 0);
        }

        for (int i = 0; i < 14; i++) {
            Node node = scores[i];
            map.put(node.name, map.getOrDefault(node.name, 0) + 1);
        }

        ArrayList<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for(char c: list){
            sb.append(c).append(" ").append(map.get(c)).append("\n");
        }
        System.out.println(sb.toString());
    }

    static class Node{
        char name;
        double score;

        public Node(char name, double score){
            this.name = name;
            this.score = score;
        }
    }

}