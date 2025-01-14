import java.util.*;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[k];
        long max = 0;
        for(int i = 0; i < k; i++){
            arr[i] = sc.nextInt();
            max = Math.max(arr[i], max);
        }

        long start = 1;
        long end = max;
        long answer = 0;
        while(start <= end){
            long mid = (start + end) / 2;
            long result = cut(arr, mid);

            if(result < n){
                end = mid - 1;
            } else {
                start = mid + 1;
                answer = mid;
            }

        }
        System.out.println(answer);
    }

    public static long cut(int[] arr, long length){
        long count = 0;
        for(int i = 0; i < arr.length; i++){
            count += ((long)arr[i] / length);
        }
        return count;
    }
}