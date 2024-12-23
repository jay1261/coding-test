import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int start = 666;
        
        int count = 1;
        
        while(count != n){
            if(hasTripleSix(++start)){
                count++;
            }
        }
        
        System.out.println(start);
    }
    
    public static boolean hasTripleSix(int num){
        String str = String.valueOf(num);
        return str.contains("666");
    }
    
}