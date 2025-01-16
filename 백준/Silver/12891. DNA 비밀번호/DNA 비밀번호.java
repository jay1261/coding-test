import java.util.*;

class Main{
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int p = sc.nextInt();
        sc.nextLine();

        String input = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', sc.nextInt());
        map.put('C', sc.nextInt());
        map.put('G', sc.nextInt());
        map.put('T', sc.nextInt());
        int sum = 0;
        for(int num: map.values()){
            sum += num;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < p; i++){
            char c = input.charAt(i);
            sb.append(c);
            int num = map.get(c);
            if(num > 0){
                sum--;
            }
            num--;

            map.put(c, num);
        }

        int answer = 0;
        if(sum == 0){
            answer++;
        }

        for(int i = p; i < s; i++){
            char c = input.charAt(i);
            sb.append(c);

            int num = map.get(c);
            if(num > 0){
                sum--;
            }
            num--;
            map.put(c, num);

            char c2 = input.charAt(i-p);
            sb.delete(0, 0);

            int num2 = map.get(c2);
            if(++num2 > 0){
                sum++;
            }
            map.put(c2, num2);

            if(sum == 0){
                answer++;
            }
        }

        System.out.println(answer);
    }
}