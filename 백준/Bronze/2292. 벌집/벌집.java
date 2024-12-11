import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() - 1;
        int count = 1;

        while(n > 0){
            n -= 6 * count;
            count++;
        }

        System.out.println(count);
    }
}
