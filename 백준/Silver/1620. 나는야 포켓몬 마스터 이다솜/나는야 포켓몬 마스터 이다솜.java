import java.util.*;

class Main{
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i <= n; i++){
            String pocketmon = sc.nextLine();
            map.put(pocketmon, i);
            map2.put(i, pocketmon);
        }
        
        for(int i = 0; i < m; i++){
            String str = sc.nextLine();
            try{
                int num = Integer.parseInt(str);
                System.out.println(map2.get(num));
            } catch(Exception e) {
                System.out.println(map.get(str));
            }
        }
    }
}