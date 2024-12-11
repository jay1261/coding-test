import java.util.*;

class Main{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        for(int i = 1; i <= num; i++){
            if(process(i) == num){
                result = i;
                break;
            }
        }
         System.out.println(result);
    }

    public static int process(int num){
        String str = num+"";
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            sum += Integer.parseInt(str.charAt(i)+"");
        }
        return num + sum;
    }
}