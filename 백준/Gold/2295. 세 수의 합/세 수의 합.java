import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                set.add(arr[i] + arr[j]);
            }
        }
        int answer = 0;
        for(int i = n -1 ; i >= 0; i--){
            for(int j = 0 ; j < n; j++){
                if(set.contains(arr[i] - arr[j])){
                    answer = Math.max(arr[i], answer);
                    break;
                }
            }
        }
        System.out.println(answer);
	}
}