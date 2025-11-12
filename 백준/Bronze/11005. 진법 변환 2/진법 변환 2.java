import java.util.*;

class Main{
    static int offset = 55;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        int temp = n;
        while(temp / b > 0){
            int remain = temp % b;
            if (remain >= 10){
                sb.insert(0, (char)(remain + offset));                
            } else {
                sb.insert(0, remain);                
            }

            temp = temp / b;
        }
        int remain = temp % b;
        if (remain >= 10){
            sb.insert(0, (char)(remain + offset));                
        } else {
            sb.insert(0, remain);                
        }

        System.out.println(sb);
    }
}