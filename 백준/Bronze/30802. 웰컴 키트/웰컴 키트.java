import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[6];
        for(int i = 0; i < 6; i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int p = sc.nextInt();

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i] / t;
            if(arr[i] % t != 0){
                sum++;
            }
        }
        
        System.out.println(sum); 
        System.out.println(n/p + " " + n%p);
    }
}