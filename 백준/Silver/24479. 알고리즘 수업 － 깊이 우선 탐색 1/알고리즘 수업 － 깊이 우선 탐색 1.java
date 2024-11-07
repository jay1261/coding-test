import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
 	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	     
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), R = Integer.parseInt(st.nextToken());
		
		// 그래프 구현 
		HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken()), n2 = Integer.parseInt(st.nextToken());
			
			if (graph.get(n1) == null) graph.put(n1, new ArrayList<Integer>());
			graph.get(n1).add(n2);
			
			if (graph.get(n2) == null) graph.put(n2, new ArrayList<Integer>());
			graph.get(n2).add(n1);
		}
		
		// 인접 노드 오름차순으로 방문 하기 위해 연결되어 있는 노드들을 내림차순으로 정렬 
		for (ArrayList<Integer> val: graph.values()) Collections.sort(val, Collections.reverseOrder());
		
		
		// dfs   
		boolean[] visited = new boolean[N + 1];
		int[] order = new int[N + 1];            // 방문순서 기록할 배열 선언 
		int cnt = 0;                             // 방문순서 count할 변수 선언 
		
		Stack<Integer> stack = new Stack<>();
		stack.push(R);
		
		while (!stack.empty()) {
			int n = stack.pop();
			
			if (visited[n]) continue;
			
			visited[n] = true;
			cnt++;
			order[n] = cnt;
			
			if (graph.get(n) == null) continue;
			
			for (int i = 0; i < graph.get(n).size(); i++) {
				if (!visited[graph.get(n).get(i)]) stack.push(graph.get(n).get(i));
			}
		}
		
		// 정답 출력 
		for(int i = 1; i < order.length; i++) System.out.println(order[i]);

	}
}
