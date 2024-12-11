import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(max < num){
                max = num;
            }
            arr[i] = num;
        }
        
        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += (double) arr[i] / max * 100;
        }
        
        System.out.println(sum / n);
        
    }
}