import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            arr[i] = num;
            set.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
            map.put(list.get(i), i);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int num: arr){
            sb.append(map.get(num)).append(" ");
        }
        
        System.out.println(sb.toString());
        
	}
}