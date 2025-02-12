import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] trees = new int[n];

        int max = 0;
        for(int i = 0; i < n; i++){
            trees[i] = sc.nextInt();
            max = Math.max(max, trees[i]);
        }


        long start = 0;
        long end = max;
        long answer = 0;
        while(start < end){
            long mid = (start + end) / 2;
            long cut = cutTrees(trees, mid);

            if(cut < m){
                end = mid;
            } else {
                start = mid+1;
                answer = mid;
            }
        }

        System.out.println(answer);
    }

    public static long cutTrees(int[] trees, long h){
        long result = 0;
        for(int i = trees.length - 1; i >= 0; i--){
            if(trees[i] > h){
                result += (trees[i] - h);
            }
        }

        return result;
    }
}