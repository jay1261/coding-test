import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++){
            int num = sc.nextInt();
            
            System.out.println(solution(num));
        }
    }
    
    public static int solution(int num){
        for(int i = 1; i <= 44; i++){
            for(int j = 1; j <= 44; j++){
                for(int k = 1; k <= 44; k++){
                    if(triangleNum(i) + triangleNum(j) + triangleNum(k)==num){
                        return 1; 
                    }
                }
            }
        }
        return 0;
    }
    
    public static int triangleNum(int n){
        return n * (n+1) / 2;
    }   
}