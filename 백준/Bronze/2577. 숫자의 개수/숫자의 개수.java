import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String result = String.valueOf(a*b*c);
        
        int[] array = new int[10];
        
        for(int i = 0; i < result.length(); i++){
            int num = Integer.valueOf(result.charAt(i)+"");
            array[num]++;
        }
        
        for(int i = 0; i < 10; i++){
            System.out.println(array[i]);
        }

    }
}