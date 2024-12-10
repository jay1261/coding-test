import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = 31;
        int m = 1234567891;
        
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            char c = str.charAt(i);
            int num = (int)c - 96;
            sum += num * Math.pow(r, i);
        }
        
        System.out.println(sum % m);
    }
}