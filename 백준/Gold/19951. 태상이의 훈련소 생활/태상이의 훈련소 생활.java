import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        
        String[] splited = sc.nextLine().split(" ");
        int[] ground = new int[n+1];
        int[] prefixGround = new int[n+2];
        
        for(int i = 1; i <= n; i++){
            ground[i] = Integer.parseInt(splited[i-1]);
        }
        
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            
            prefixGround[a] += k;
            prefixGround[b+1] -= k;
        }
        
        for(int i = 1; i <= prefixGround.length-1; i++){
            prefixGround[i] = prefixGround[i-1] + prefixGround[i];
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            sb.append(ground[i] + prefixGround[i]).append(" ");
        }
        System.out.println(sb.toString());
	}
}