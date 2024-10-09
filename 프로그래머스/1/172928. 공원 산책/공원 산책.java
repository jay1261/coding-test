import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        HashMap<String, int[]> hashMap = new HashMap<>();
        hashMap.put("S", new int[]{1, 0});
        hashMap.put("E", new int[]{0, 1});
        hashMap.put("N", new int[]{-1, 0});
        hashMap.put("W", new int[]{0, -1});
        
        int[] currentPosition = {0,0};
        
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    currentPosition = new int[]{i, j};
                    break;
                }
            }
        }
        
        for(int i = 0; i < routes.length; i++){
            String[] splited = routes[i].split(" ");
            String direction = splited[0];
            int distance = Integer.parseInt(splited[1]);
            

            
            int nx = currentPosition[0] + hashMap.get(direction)[0] * distance;
            int ny = currentPosition[1] + hashMap.get(direction)[1] * distance;
                
            
            if(nx >= park.length || nx < 0 || ny >= park[0].length() || ny < 0){
                continue;
            }
            
            int x = currentPosition[0];
            int y = currentPosition[1];
            boolean flag = true;
            
            for(int j = 1; j <= distance; j++){
                int tmpX = currentPosition[0] + hashMap.get(direction)[0] * j;
                int tmpY = currentPosition[1] + hashMap.get(direction)[1] * j;
                if(park[tmpX].charAt(tmpY) == 'X'){
                    flag = false;
                    System.out.println(tmpX + ", " + tmpY);
                    break;
                }
            }
            
            if(!flag){
                continue;
            }
            
            currentPosition = new int[]{nx, ny};
            // System.out.println(i);
            // System.out.println(Arrays.toString(currentPosition));
        }
    
        return currentPosition;
    }
}