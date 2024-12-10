import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        int[] array = new int[26];
        Arrays.fill(array, -1);
            
        for(int i = 0; i < input.length(); i++){
            int index = (int)input.charAt(i) - 97;
            if(array[index] == -1){
                array[index] = i;
            }
        }
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}