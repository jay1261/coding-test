import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        // k 진수로 변환
        while(n > 0){
            sb.append(n % k);
            
            n = n / k;
        }
        
        String kjin = sb.reverse().toString();
        // System.out.println(kjin);
        
        // 조건에 맞게 분리
        Stack<String> stack = new Stack<>();
        for(int i = kjin.length()-1; i >= 0; i--){
            stack.push(kjin.charAt(i)+"");

            if(kjin.charAt(i) == '0' || i == 0){
                if(stack.peek().equals("0")){
                    stack.pop();
                }
                sb = new StringBuilder();
                while(!stack.isEmpty() && !stack.peek().equals("0")){
                    sb.append(stack.pop());
                }
                
                if(sb.length()==0){
                    continue;
                }
                
                long number = Long.valueOf(sb.toString());
                System.out.println(number);
                System.out.println(isPrime(number));
                
                if(isPrime(number)){
                    answer++;
                }
                
            } 
        }

        return answer;
    }
    
    public boolean isPrime(long num){
        boolean result = true;
        
        if(num == 1){
            return false;
        }   
        
        for(int i = 2; i <= Math.sqrt(num); i++){
   
            if(num % i == 0){
                // System.out.println("i: "+i);

                result = false;
                break;
            }
        }
        
        return result;
    }
}