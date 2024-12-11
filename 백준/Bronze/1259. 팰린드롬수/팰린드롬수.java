import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.nextLine();
            if(str.equals("0")){
                break;
            }
            String answer = "yes";
            for(int i = 0; i < str.length()/2; i++){
                if(str.charAt(i) != str.charAt(str.length() - i-1)){
                    answer = "no";
                    break;
                }
            }
            System.out.println(answer);
        }
           
    }
}