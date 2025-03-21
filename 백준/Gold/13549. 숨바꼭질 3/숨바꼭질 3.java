import java.util.*;

class Main {
    static int MAX = 100000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(findFastestTime(n, k));
    }

    public static int findFastestTime(int n, int k) {
        if (n >= k) return n - k; 

        int[] distances = new int[MAX + 1]; 
        Arrays.fill(distances, Integer.MAX_VALUE);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(n);
        distances[n] = 0; 

        while (!deque.isEmpty()) {
            int x = deque.poll();

            if (x == k) return distances[x];
            
            int[] nextArr = {x * 2, x - 1, x + 1};
            for (int i = 0; i < 3; i++) {
                int next = nextArr[i];

                if (next >= 0 && next <= MAX && distances[next] == Integer.MAX_VALUE) {
                    if (i == 0) {
                        distances[next] = distances[x];
                        deque.offerFirst(next); 
                    } else { 
                        distances[next] = distances[x] + 1;
                        deque.offerLast(next);
                    }
                }
            }
        }
        return -1; 
    }
}