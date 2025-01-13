import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long start = 0;
        long end = (long) Math.sqrt(Long.MAX_VALUE)+1;

        while(start < end){
            long mid = (start + end) / 2;

            if(mid*mid == num){
                start = mid;
                break;
            }
            else if(mid*mid < num){
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        System.out.println(start);
    }
}