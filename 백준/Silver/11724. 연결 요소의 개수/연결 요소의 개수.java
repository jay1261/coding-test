import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 1; i <= n; i++){
            map.put(i, new ArrayList<>());
        }
        
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            map.get(a).add(b);
            map.get(b).add(a);
        }
        
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[n+1];
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(visited[i]){
                continue;
            }
            stack.push(i);
            visited[i] = true;
            
            while(!stack.isEmpty()){
                int current = stack.pop();
                ArrayList<Integer> list = map.get(current);
                for(int num: list){
                    if(!visited[num]){
                        visited[num] = true;
                        stack.push(num);
                    }
                }
            }
            answer++;
        }
        
        System.out.println(answer);
    }
}