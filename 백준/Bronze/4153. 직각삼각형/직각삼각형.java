import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        while(true){
            array[0] = sc.nextInt();
            array[1] = sc.nextInt();
            array[2] = sc.nextInt();
            
            if(array[0] == 0){
                break;
            }
            
            Arrays.sort(array);
            if(array[2] * array[2] == array[0] * array[0] + array[1] * array[1]){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }
    }
}