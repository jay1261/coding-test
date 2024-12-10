import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = {1,2,3,4,5,6,7,8};
        int[] array2 = {8,7,6,5,4,3,2,1};
        int[] input = new int[8];
        
        for(int i = 0; i < 8; i++){
            input[i] = sc.nextInt();
        }

        if(Arrays.equals(array1, input)){
            System.out.println("ascending");            
        } else if(Arrays.equals(array2, input)){
            System.out.println("descending");            
        } else{
            System.out.println("mixed");            
        }
    }
}
