import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        arr[0] = 0;
        int max = 0;
        
        for(int i = 1; i <= n; i++){
            int num = sc.nextInt();
            
            if(i == n){
                max = arr[i-1] + num;
                continue;
            }
            
            arr[i] = arr[i-1] + num;
        }
        
        // 0 1 3 6 10 15
        
        int answer = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int right = arr[j] - arr[i];
                int left = max - right;
                int result = right < left ? right : left;
                answer = Math.max(result, answer);
            }
        }
        
        System.out.println(answer);
	}
}