import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1; i <=n; i++){
            arr[i] = sc.nextInt();
        }
        
        int[] pSum = new int[n+2];
        for(int i = 0; i < m; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int k = sc.nextInt();
            
            pSum[start] += k;
            pSum[end + 1] += k * -1;
        }
        
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < pSum.length-1; i++){
            pSum[i] = pSum[i] + pSum[i-1];
            
            sb.append(arr[i] + pSum[i]).append(" ");
        }
        
        System.out.println(sb);
        
    }
}