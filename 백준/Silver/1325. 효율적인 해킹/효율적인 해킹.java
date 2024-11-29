import java.util.*;

class Main{
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static ArrayList<Integer> resultList = new ArrayList<>();
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int i = 0; i < N+1; i++){
            graph.add(new ArrayList<Integer>());
            resultList.add(0);
        }

        for(int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(b).add(a);
        }

        int max = 0;
        for(int i = 1; i <= N; i++){
            int result = bfs(i, N);
            if(max < result){
                max = result;
            }
            resultList.set(i, result);
        }

        for(int i = 0; i < N+1; i++){
            if(resultList.get(i) == max){
                System.out.print(i + " ");
            }
        }
    }

    public static int bfs(int start, int N){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[N+1];

        queue.offer(start);
        visited[start] = true;
        int count = 1;

        while(!queue.isEmpty()){
            int current = queue.poll();
            ArrayList<Integer> list = graph.get(current);

            for(int num: list){
                if(!visited[num]){
                    visited[num] = true;
                    queue.offer(num);
                    count++;
                }
            }
        }

        return count;
    }
}