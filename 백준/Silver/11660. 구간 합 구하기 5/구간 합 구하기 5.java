import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        
        int[][] prefixSumArr = new int[n+1][n+1];
        
        for(int i = 1; i <= n; i++){
            String[] splited = sc.nextLine().split(" ");
            for(int j = 1; j <= n; j++){
                int num = Integer.parseInt(splited[j-1]);
                prefixSumArr[i][j] = prefixSumArr[i-1][j] + prefixSumArr[i][j-1] - prefixSumArr[i-1][j-1] + num;
            }
        }
        
        for(int i = 0; i < m; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            int answer = prefixSumArr[x2][y2] - prefixSumArr[x1-1][y2] - prefixSumArr[x2][y1-1] + prefixSumArr[x1-1][y1-1];
            System.out.println(answer);
            
        }
        
	}
}