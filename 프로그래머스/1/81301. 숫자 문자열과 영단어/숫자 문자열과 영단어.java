import java.util.*;

class Solution {
    public int solution(String s) {
        String[] alpha =  {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < alpha.length; i++){
            s = s.replace(alpha[i], i+"");
        }
        
        return Integer.valueOf(s);
    }
//         ArrayList<String> alpha = new ArrayList<>(Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));
//         String tmp = "";
//         String answer = "";
        
//         for(int i = 0; i < s.length(); i++){
            
            
//             if(s.charAt(i) < 65){
//                 answer += s.charAt(i);
//             } else {
//                 tmp += s.charAt(i);
//             }
            
//             if(alpha.contains(tmp)){
//                 answer += alpha.indexOf(tmp);
//                 tmp = "";
//                 System.out.println(tmp);
//             }
//         }
        
//         return Integer.valueOf(answer);
//     }
}