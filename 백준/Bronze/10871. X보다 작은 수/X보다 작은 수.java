import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(x > num){
                System.out.print(num + " ");
            }
        }
    }
}