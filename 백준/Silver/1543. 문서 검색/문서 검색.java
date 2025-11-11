import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        
        int answer = 0;
        for(int i = 0; i < input1.length() - input2.length()+1; i++){

            int count = 0;
            
            for(int j = 0; j < input2.length(); j++){
                char c1 = input1.charAt(i+j);
                char c2 = input2.charAt(j);
                
                if(c1 == c2){
                    count++;
                } else {
                    break;
                }
            }
            
            // System.out.println("카운트: " + count);
            if(count == input2.length()){
                answer++;
                i += input2.length()-1;
            }
        }
        System.out.println(answer);
    }
}