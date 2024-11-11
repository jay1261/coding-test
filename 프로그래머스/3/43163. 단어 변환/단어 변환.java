import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        
        if (!Arrays.asList(words).contains(target)) {
            return 0;
        }
        
        Queue<Node> queue = new LinkedList<>();
        boolean[] visited = new boolean[words.length];
        
        
        queue.offer(new Node(begin, 0));
        
        while(!queue.isEmpty()){
            // System.out.println("queue: " + queue);
            Node node = queue.poll();
            
            if(node.word.equals(target)){
                return node.depth;
            }
            
            for(int i = 0; i < words.length; i++){
                if(!visited[i] && canChange(node.word, words[i])){
                    queue.offer(new Node(words[i], node.depth + 1));
                    visited[i] = true;
                }
            }
            
        }
        
        return 0;
    }
    
    public boolean canChange(String a, String b){
        int count = 0;
        
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        
        return count == 1;
    }
    
    class Node{
        public String word;
        public int depth;
        
        Node(String word, int depth){
            this.word = word;
            this.depth = depth;
        }
        
        @Override
        public String toString(){
            return "[" + word + ", " + depth + "]";
        }
    }
}