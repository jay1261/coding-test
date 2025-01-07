import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        String[] splited = sc.nextLine().split(" ");

        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        for(String str: splited){
            int num = Integer.parseInt(str);
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
       
        ArrayList<Integer> list = new ArrayList<>(hashMap.keySet());
        Collections.sort(list, (o1,o2) -> Integer.compare(hashMap.get(o2), hashMap.get(o1)));
        
        StringBuilder sb = new StringBuilder();
        for(int num: list){
            for(int i = 0; i < hashMap.get(num); i++){
                sb.append(num).append(" ");
            }
        }
        System.out.println(sb.toString());
	}
}