import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] splited = sc.nextLine().split(" ");
         
        int count = 0;
        for(String str: splited){
            if(!str.isBlank()){
                count++;
            }
        }
        System.out.println(count);
    }
}