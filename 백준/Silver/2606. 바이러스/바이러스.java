import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int connectionCount = sc.nextInt();
        
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 1; i <= n; i++){
            map.put(i, new ArrayList<Integer>());
        }
        
        for(int i = 0; i < connectionCount; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            map.get(x).add(y);
            map.get(y).add(x);
        }
        
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[n+1];
        stack.push(1);
        visited[1] = true;
        int answer = 0;
        
        while(!stack.isEmpty()){
            int current = stack.pop();
            ArrayList<Integer> list = map.getOrDefault(current, new ArrayList<Integer>());
            for(int num: list){
                if(!visited[num]){
                    stack.push(num);
                    visited[num] = true;
                    answer++;
                }
            }
        }
        
        
        System.out.println(answer);
        
    }
}