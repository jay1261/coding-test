import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int[] answer = new int[n+m];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }

        int index1 = 0;
        int index2 = 0;
        for(int i = 0; i < n+m; i++){
            int num = 0;

            if(index1 >= n){
                num = arr2[index2++];
            }
            else if(index2 >= m){
                num = arr1[index1++];
            }
            else if(arr1[index1] <= arr2[index2]){
                num = arr1[index1++];
            }
            else if(arr1[index1] > arr2[index2]){
                num = arr2[index2++];
            }

            answer[i] = num;
        }

        StringBuilder sb = new StringBuilder();
        for(int num: answer){
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}