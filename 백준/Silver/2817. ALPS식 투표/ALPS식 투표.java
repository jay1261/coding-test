import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int cCount = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        
        List<Character> names = new ArrayList<>();
        List<Integer> votes = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            String[] inputs = sc.nextLine().split(" ");
            
            if(Double.valueOf(inputs[1]) >= ((double) cCount *0.05)){
                names.add(inputs[0].charAt(0));
                votes.add(Integer.valueOf(inputs[1]));    
            }
        }
        
        List<Score> scores = new ArrayList<>();
        
        for(int i = 0; i < names.size(); i++){
            char name = names.get(i);
            int vote = votes.get(i);
            
            for(int j = 1; j <= 14; j++){
                scores.add(new Score(name, (double) vote / j));
            }
        }
        
        scores.sort((o1, o2) -> Double.compare(o2.score, o1.score));
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < names.size(); i++){
            map.put(names.get(i), 0);
        }
        
        for(int i = 0; i < 14; i++){
            char name = scores.get(i).name;
            map.put(name ,map.get(name) + 1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for(char c: list){
            sb.append(c).append(" ").append(map.get(c)).append("\n");
        }
        
        System.out.println(sb);
	}
    
    
    static class Score {
        public char name;
        public double score;
        
        public Score(char name, double score){
            this.name = name;
            this.score = score;
        }
        
        @Override
        public String toString(){
            return "[" + name + ", " + score + "]\n";
        }
    }
}