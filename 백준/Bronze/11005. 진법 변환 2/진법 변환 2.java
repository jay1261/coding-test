import java.util.*;

class Main{    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Character> map = new HashMap<>();

        int n = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < 10; i++){
            map.put(i, (char) ('0'+ i));
        }
        for(int i = 10; i < 36; i++){
            map.put(i, (char) ('A' + i - 10));
        }

        StringBuilder sb = new StringBuilder();

        while(n > 0){
            int mod = n % b;
            n = n / b;

            sb.insert(0, map.get(mod));
        }

        System.out.println(sb.toString());
    }
}