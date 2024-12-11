import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();        
        for(int i = 0; i < t; i++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            
            int[] arr = new int[n+1];
            for(int j = 1; j <= n; j++){
                arr[j] = j;
            }
            
            for(int j = 0; j < k; j++){
                for(int l = 2; l <= n; l++){
                    arr[l] = arr[l-1] + arr[l];
                }
            }
            System.out.println(arr[n]);
        }
            
    }
}
// 1 5 15 35 70
// 1 4 10 20 35
// 1 3 6 10 15
// 1 2 3 4 5