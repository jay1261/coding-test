import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nq = br.readLine().split(" ");
        int n = Integer.parseInt(nq[0]);
        int q = Integer.parseInt(nq[1]);

        int[] arr = new int[n + 1];
        int[] prefixXor = new int[n + 1];

        String[] inputs = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(inputs[i - 1]);
            prefixXor[i] = prefixXor[i - 1] ^ arr[i];
        }

        int answer = 0;
        for (int i = 0; i < q; i++) {
            String[] se = br.readLine().split(" ");
            int s = Integer.parseInt(se[0]);
            int e = Integer.parseInt(se[1]);

            answer ^= prefixXor[e] ^ prefixXor[s - 1];
        }

        System.out.println(answer);
    }
}