import java.util.*;

class Main{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = 1;
        int sum = arr[start];
        int answer = n+1;

        while(end <= n){
            if(sum >= s){
                answer = Math.min(answer, end - start);
                sum -= arr[start];
                start++;
            } else {
                if(end < n){
                    sum += arr[end];
                }
                end++;
            }
        }

        System.out.println(answer == n+1 ? 0 : answer);
    }
}