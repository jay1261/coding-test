import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine()); // 첫 번째 입력
        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        String[] arr = new String[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = br.readLine(); // 문자열 배열 입력
            graph[i] = new ArrayList<>();
        }

        int startNode = 0;

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);

            if (i == n - 2) {
                startNode = a;
            }
        }

        boolean[] visited = new boolean[n + 1];
        stack.push(startNode);
        visited[startNode] = true;

        while (!stack.isEmpty()) {
            int current = stack.pop();
            sb.append(arr[current]);
            ArrayList<Integer> list = graph[current];
            for (int i = list.size() - 1; i >= 0; i--) {
                int num = list.get(i);
                if (!visited[num]) {
                    visited[num] = true;
                    stack.push(num);
                }
            }
        }
        System.out.println(sb.toString());
    }

    
}