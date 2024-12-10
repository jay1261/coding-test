import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            
            int count = 0;
            int sum = 0;
            for(int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                if(c == 'O'){
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}