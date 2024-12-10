import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            
            int floor = n % h == 0 ? h : n % h; 
            int ho = (n + h - 1) / h; 
            
            if(ho < 10){
                System.out.println(floor + "0" + ho);
            } else {
                System.out.println(floor + "" + ho);
            }

        } 
    }
}