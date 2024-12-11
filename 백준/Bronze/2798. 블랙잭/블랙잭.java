import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        Integer[] arr = new Integer[n];
      
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        //Arrays.sort(arr, (o1,o2) -> Integer.compare(o2, o1));
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    if(arr[i] + arr[j] + arr[k] <= m){
                        list.add(arr[i] + arr[j] + arr[k]);
                    }
                }
            }
        }
        
        int max = 0;
        for(int i = 0; i < list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println(max);
    }

}
