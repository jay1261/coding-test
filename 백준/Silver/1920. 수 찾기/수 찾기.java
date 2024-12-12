import java.util.*;

class Main{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr1);

        for(int i = 0; i < m; i++){
            int num = arr2[i];
            if(binarySearch(num, arr1, 0, n-1)){
                sb.append(1 + "\n");
            } else {
                sb.append(0 + "\n");
            }
        }

        System.out.println(sb.toString());
    }

    public static boolean binarySearch(int num, int[] arr, int start, int end) {
        if (start > end) {
            return false;
        }
        
        int mid = (end + start) / 2;

        if (arr[mid] == num) {
            return true;
        } else if (arr[mid] > num) {
            return binarySearch(num, arr, start, mid - 1);
        } else {
            return binarySearch(num, arr, mid+1, end);
        }
    }
}