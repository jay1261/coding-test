import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        String[][] arr = new String[n][2];
        
        for(int i = 0; i < n; i++){
            String[] splited = sc.nextLine().split(" ");
            arr[i][0] = splited[0];
            arr[i][1] = splited[1];
        }
        
        Arrays.sort(arr, (o1,o2) -> Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0])));
        
        for(String[] a: arr){
            System.out.println(a[0] + " " + a[1]);
        }
    }
}