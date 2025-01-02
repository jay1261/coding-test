import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String dock = sc.nextLine();
        String word = sc.nextLine();

        int count = 0;
        while(dock.contains(word)){
            dock = dock.replaceFirst(word, ".");
            count++;

        }

        System.out.println(count);

    }
}