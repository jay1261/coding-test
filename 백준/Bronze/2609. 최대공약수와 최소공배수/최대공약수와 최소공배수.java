import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int gcd = gcd(a,b);
        System.out.println(gcd);
        System.out.println(a*b/gcd);
    }
    
    public static int gcd(int a, int b){
        if(a % b == 0){
            return b;
        }
        
        return gcd(b, a%b);
    }
}