import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        int[] answer = {0,0};
        int min = Integer.MAX_VALUE;
        
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            int num = arr[start] + arr[end];
                        
            if(min > Math.abs(num)){
                min = Math.abs(num);
                answer[0] = arr[start];
                answer[1] = arr[end];
            }
            
            if(num < 0){
                start++;
            } else {
                end--;
            }
        }
        
        System.out.println(answer[0] + " " + answer[1]);

	}

}