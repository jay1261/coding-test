import java.util.*;

class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int start = 0;
        int end = 0;
        int answer = Integer.MAX_VALUE;
        while(start < n && end < n){
            int num = arr[end] - arr[start];

            if(num == m){
                answer = m;
                break;
            }
            else if(num < m){
                end++;
            } else {
                answer = Math.min(answer, num);
                start++;
            }
        }

        System.out.println(answer);
    }
}