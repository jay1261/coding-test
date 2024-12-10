import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += Integer.parseInt(str.charAt(i) + "");
        }
        
        System.out.println(sum);
    }
}