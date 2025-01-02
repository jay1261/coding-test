import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        Arrays.sort(arr);

        int count = 0;
        int p = 0;
        int q = arr.length-1;
        
        while(p < q){
            if(arr[p] + arr[q] == x){
                p++;
                q--;
                count++;
            } else if(arr[p] + arr[q] < x){
                p++;
            } else if(arr[p] + arr[q] > x){
                q--;
            }
        }
        
        System.out.println(count);
    }

   
    
}