
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> countList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (i == 0) {
                numList.add(num);
                countList.add(1);
                continue;
            }

            if (numList.get(numList.size() - 1).equals(num)) {
                countList.set(countList.size() - 1, countList.get(countList.size() - 1) + 1);
            } else {
                numList.add(num);
                countList.add(1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        int[] answer = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            int index = binarySearch(numList, 0, numList.size() - 1, target);
            if (index == -1) {
                answer[i] = 0;
            } else {
                answer[i] = countList.get(index);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(answer[i]).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static int binarySearch(ArrayList<Integer> list, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;
        if (list.get(mid).equals(target)) {
            return mid;
        } else if (list.get(mid) > target) {
            return binarySearch(list, start, mid - 1, target);
        } else {
            return binarySearch(list, mid + 1, end, target);
        }
    }
}