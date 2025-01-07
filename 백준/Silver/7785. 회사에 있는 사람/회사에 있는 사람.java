import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        
        int n = sc.nextInt();
        sc.nextLine();        
        
        for(int i = 0; i < n; i++){
            String[] splited = sc.nextLine().split(" ");
            
            if(splited[1].equals("enter")){
                set.add(splited[0]);
            } else {
                set.remove(splited[0]);
            }    
        }
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        
        for(String name: list){
            System.out.println(name);
            
        }
    }
}