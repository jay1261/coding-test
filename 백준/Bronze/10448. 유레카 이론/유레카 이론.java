import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int num = sc.nextInt();
            int result = 0;
            for(int j = 1; j < 45; j++){
                for(int k = 1; k < 45; k++){
                    for(int l = 1; l < 45; l++){
                        if(getTn(j) + getTn(k) + getTn(l) == num){
                            result = 1;
                            break;
                        };
                    }   
                }   
            }
            
            System.out.println(result);
        }
    }

    public static int getTn(int n){
        return n * (n+1) / 2;
    }
}