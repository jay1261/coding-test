import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        
        int x = sc.nextInt();
        Arrays.sort(arr);
        
        int answer = 0;
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == x){
                answer++;
                left++;
                right--;
            }else if(sum < x){
                left++;
            } else {
                right--;
            }
        }
        
        System.out.println(answer);
    }
}