import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] map = new String[n];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            map[i] = sc.nextLine();
        }
        
        int colCount = 0;
        int rowCount = 0;
        
        for(int i = 0; i < n; i++){
            boolean flag = true;
            for(int j = 0; j < m; j++){
                if(map[i].charAt(j) == 'X'){
                    flag = false;
                    break;
                }
            }
            if(flag){
                colCount++;
            }
        }
        
        for(int i = 0; i < m; i++){
            boolean flag = true;
            for(int j = 0; j < n; j++){
                if(map[j].charAt(i) == 'X'){
                    flag = false;
                }
            }
            if(flag){
                rowCount++;
            }
        }
        
        System.out.println(Math.max(colCount, rowCount));
    }
}