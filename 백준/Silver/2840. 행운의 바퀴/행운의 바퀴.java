import java.util.*;

class Main{
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        String[] arr = new String[n];
        
        int index = 0;
        for(int i = 0; i < k; i++){
            int s = sc.nextInt();
            String c = sc.next();
            
            index = (index + s) % n;
            //System.out.println("index: " + index);
            if(arr[index] == null){
                arr[index] = c;
                if(!set.add(c)){
                    System.out.println("!");
                    return;                    
                }
            } else if(arr[index].equals(c)){
                continue;
            } else {
                System.out.println("!");
                return;
            }
        }
        index++;
        for(int i = 0; i < n; i++){
            index = Math.abs((index - 1 + n) % n);
            //System.out.print(index);                
            if(arr[index] == null){
                System.out.print("?");                
            } else {
                System.out.print(arr[index]);
            }

        }
        
    }
}