import java.util.*;

class Main{
    static int N;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int startNode;
    static ArrayList<Integer> cycleList = new ArrayList<>();

    static int[] answer;

    public static void dfs(int idx, LinkedList<Integer> cycle,int count) {
        visited[idx] = true;

        for(int next : graph[idx]) {
            if(!visited[next]) {
                cycle.add(next);
                dfs(next, cycle, count+1);
                cycle.removeLast();
            } else {
                if(count >= 3 && next == startNode) {
                    cycleList = new ArrayList<>(cycle);
                    return;
                }
            }
        }
    }

    public static void getDepth(int idx, int depth) {
        visited[idx] = true;
        answer[idx] = depth;

        for(int next : graph[idx]) {
            if(!visited[next]) {
                getDepth(next, depth+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        visited = new boolean[N+1];
        graph = new ArrayList[N+1];
        answer = new int[N+1];

        for(int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            int x = input.nextInt();
            int y = input.nextInt();

            graph[x].add(y);
            graph[y].add(x);
        }

        for(int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        for(int i = 1; i <= N; i++) {
        visited = new boolean[N+1];
            if(!visited[i]) {
                startNode = i;
                LinkedList<Integer> list = new LinkedList<>();
                list.add(i);
                dfs(i, list, 1);
            }

            if(!cycleList.isEmpty()) {
                break;
            }
        }

        visited = new boolean[N+1];

        for(int n : cycleList) {
            visited[n] = true;
        }

        for(int n : cycleList) {
            getDepth(n, 0);
        }

        for(int i = 1; i <= N; i++) {
            if(i == N) {
                System.out.print(answer[i]);
            } else {
                System.out.print(answer[i] + " ");
            }
        }
    }
}