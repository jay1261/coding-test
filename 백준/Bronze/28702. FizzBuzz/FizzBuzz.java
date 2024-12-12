import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        int num = 0;
        
        for(int i = 1; i <= 3; i++){
            boolean flag = true;
            int input = 0;
            try{
                input = Integer.parseInt(sc.nextLine());
            } catch (Exception e){
                flag = false;
            }
            
            if(flag){
                n = i;
                num = input;
            }
        }
        
        for(int i = 1; i <= 4-n; i++){
            num++;
        }
        
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        } else if(num % 3 == 0){
            System.out.println("Fizz");
        } else if(num % 5 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}