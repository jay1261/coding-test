import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        
        char[][] map = new char[n][m];
            
        int xCount = 0;
        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            map[i] = str.toCharArray();
            
            if(!str.contains("X")){
                xCount++;
            }
        }
            
        int yCount = 0;
        for(int i = 0; i < m; i++){
            boolean hasGuard = false;
            for(int j = 0; j < n; j++){
                if(map[j][i] == 'X'){
                    hasGuard = true;
                }
            }
            if(!hasGuard){
                yCount++;
            }
        }
        
        System.out.println(Math.max(xCount, yCount));

    }
}