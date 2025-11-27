import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] prefix = new int[n+1];
        
        for(int i = 1; i <= n; i++){
            int num = sc.nextInt();
            arr[i-1] = num;
            prefix[i] = prefix[i-1] + num;
        }
        
        int left = 0;
        int right = 0;
        int answer = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int rDistance = prefix[j] - prefix[i];
                int lDistance = prefix[n] - (prefix[j] - prefix[i]);
                int shortOne = Math.min(rDistance, lDistance);
                
                //System.out.println("i: " + i + ", j: " + j + ", rd: " + rDistance + ", ld: " + lDistance);
                answer = Math.max(answer, shortOne);
            }
        }
        
        //System.out.println(Arrays.toString(prefix));
        System.out.println(answer);
	}

    // . 1 . 2 . 3 . 4 . 5 ->
    
    // 1 3 6 10 15
}