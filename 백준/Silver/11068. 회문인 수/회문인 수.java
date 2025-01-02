import java.util.*;

class Main{
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Character> map = new HashMap<>();

        for(int i = 0; i < 10; i++){
            map.put(i, (char)(48+i));
        }
        for(int i = 0; i <= 25; i++){
            map.put(10+i, (char) ('A'+i));
        }

        for(int i = 0; i <= 25; i++){
            map.put(36+i, (char) ('a'+i));
        }
        map.put(62, '+');
        map.put(63, '/');


        int n = sc.nextInt();
        for(int i = 0; i < n; i++){

            int num = sc.nextInt();
            boolean flag = false;

            for(int j = 2; j <= 64; j++) {
                StringBuilder sb = new StringBuilder();

                int tmp = num;
                while (tmp != 0) {
                    int mod = tmp % j;
                    tmp = tmp / j;

                    sb.insert(0, map.get(mod));
                }

                if(check(sb.toString())){
                    flag = true;
                    break;
                };
            }

            if(flag){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static boolean check(String str){
        int p = 0;
        int q = str.length()-1;

        while(p < q){
            if(str.charAt(p) != str.charAt(q)){
                return false;
            }
            p++;
            q--;
        }
        return true;
    }
}