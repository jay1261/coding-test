import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Character> map = new HashMap<>();

        int num = 10;
        char c = 'A';

        for(int i = 0; i < 10; i++){
            map.put(i, (char)(48+i));
        }
        for(int i = 0; i <= 25; i++){
            map.put(num+i, (char) (c+i));
        }

        int n = sc.nextInt();
        int b = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();

        while(n != 0){
            int mod = n % b;
            n = n / b;
            
            sb.insert(0, map.get(mod));
        }
        System.out.println(sb.toString());
    }
  
}