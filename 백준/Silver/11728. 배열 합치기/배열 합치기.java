import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr1 = new int[n+m];
        
        for(int i = 0; i < n+m; i++){
            arr1[i] = sc.nextInt();
        }
        
        
        Arrays.sort(arr1);
        StringBuilder sb = new StringBuilder();
        for(int num: arr1){
            sb.append(num).append(" ");
        }
        
        System.out.println(sb);
	}
}