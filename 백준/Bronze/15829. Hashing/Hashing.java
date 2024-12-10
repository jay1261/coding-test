import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long r = 31;
        long m = 1234567891;
        
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        
        long sum = 0;
        long power = 1;
        for(int i = 0; i < n; i++){
            char c = str.charAt(i);
            int num = (int)c - 96;
            sum = (sum + (num * power) % m) % m;
            
            power = (power * r) % m;
        }
        
        System.out.println(sum);
    }
}