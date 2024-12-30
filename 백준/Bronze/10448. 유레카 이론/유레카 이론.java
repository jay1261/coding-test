import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            
            // 1 3 6 10 15 21 28 36 45 55
            
            // 3 5 8 12 17 23 30 38 47 57
            int result = 0;
            for(int j = 1; j <= 45; j++){
                for(int k = 1; k <= 45; k++){
                    for(int l = 1; l <= 45; l++){
                        if(T(j) + T(k) + T(l) == num){
                            result = 1;
                            break;
                        }
                    }
                }
            }
            
            System.out.println(result);
        }
    }
    
    public static int T(int n){
        return n * (n+1) / 2;
    }
}