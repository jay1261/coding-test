import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] tree;
    static boolean[] visited;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        tree = new ArrayList[n+1];
        
        for(int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            tree[a].add(b);
            tree[b].add(a);
        }

        visited = new boolean[n + 1];
        visited[1] = true;
        dfs(1, 0);

        System.out.println(answer % 2 == 0 ? "No" : "Yes");
    }

    public static void dfs(int node, int count) {
        ArrayList<Integer> list = tree[node];
        boolean isLeaf = true;

        for (int num : list) {
            if (!visited[num]) {
                visited[num] = true;
                isLeaf = false;
                dfs(num, ++count);
                count--;
                visited[num] = false;
            }
        }

        if (isLeaf) {
            answer += count;
        }
    }
}
