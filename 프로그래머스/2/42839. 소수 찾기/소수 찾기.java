import java.util.*;

class Solution {
    static HashSet<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        
        int answer = 0;
        String[] splited = numbers.split("");
        boolean[] visited = new boolean[splited.length];
        

        dfs(splited, visited, "", 0);
        
        // System.out.println(set);
        return set.size();
    }
    
    public void dfs(String[] splited, boolean[] visited,  String str, int depth){
        if(depth > splited.length){
            return;
        }
        
        if(!str.isEmpty() && isPrime(Integer.valueOf(str))){
            set.add(Integer.valueOf(str));
            // System.out.println("set added: " + Integer.valueOf(str));
        }
        
        for(int i = 0; i < splited.length; i++){
            if(!visited[i]){
                // System.out.println("str: " + str + ", splited[i]: " + splited[i]);
                visited[i] = true;
                dfs(splited, visited, str + splited[i], depth + 1);
                visited[i] = false;
            }
        }
    }
    
    public boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
