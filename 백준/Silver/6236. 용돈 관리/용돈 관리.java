import java.util.*;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int max = 0;
        int sum = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }

        // max가 최소 최대는 10000;
        int start = max;
        int end = sum;
        int answer = 0;

        while(start <= end){
            int mid = (start + end) / 2;
            int count = cal(arr, mid);

            if(count > m){
                start = mid + 1;
                //                answer = mid;
            } else {
                end = mid - 1;
                answer = mid;
            }
        }

        System.out.println(answer);
    }

    public static int cal(int[] arr, int money){
        int count = 1;
        int m = money;
        for(int i = 0; i < arr.length; i++){
            if(m - arr[i] < 0){
                count++;
                m = money;
            }

            m = m - arr[i];
        }

        return count;
    }

}