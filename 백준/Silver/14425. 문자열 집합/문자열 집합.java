import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr);

        int answer = 0;
        for (int i = 0; i < m; i++) {
            String target = br.readLine();
            if (search(arr, target, 0, n - 1)) {
                answer++;
            }
        }

        System.out.println(answer);
    }

    public static boolean search(String[] arr, String target, int p, int q) {
        if (q < p) {
            return false;
        }
        
        int mid = (p + q) / 2;
        int compare = target.compareTo(arr[mid]);
        
        if (target.equals(arr[mid])) {
            return true;
        } else if (compare > 0) {
            // 타겟보다 mid가 큰 경우
            return search(arr, target, mid + 1, q);
        } else {
            // 타겟보다 mid가 작은 경우
            return search(arr, target, p, mid - 1);
        }
    }
}