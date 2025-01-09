import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++){
            set.add(sc.nextLine());
        }
        
        int answer = 0;
        for(int i = 0; i < m; i++){
            if(set.contains(sc.nextLine())){
                answer++;
            }
        }
        
        System.out.println(answer);
	}
}