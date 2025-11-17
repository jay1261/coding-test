import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            String[] inputs = sc.nextLine().split(" ");
            String name = inputs[0];
            String state = inputs[1];
            
            if(state.equals("enter")){
                set.add(name);
            } else {
                set.remove(name);
            }
        }
        
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(int i = list.size()-1; i >=0; i--){
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}