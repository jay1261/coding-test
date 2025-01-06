import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        char[] arr = new char[n];
        Arrays.fill(arr, '?');

        int current = 0;
        for(int i = 0; i < k; i++){
            String[] inputs = sc.nextLine().split(" ");
            int num = Integer.parseInt(inputs[0]);
            char c = inputs[1].charAt(0);

            current = (current+num) % n;
            if(arr[current] == '?'){
                if(contains(arr, c)){
                    System.out.println("!");
                    return;
                }
                arr[current] = c;
            } else if(arr[current] != '?' && arr[current] != c){
                System.out.println("!");
                return;
            }

        }

        StringBuilder sb = new StringBuilder();
        sb.append(arr[current]);
        int index = current - 1;
        while(index != current){
            if(index < 0 ){
                index += n;
            }
            sb.append(arr[index--]);
        }
        System.out.println(sb.toString());
    }

    public static boolean contains(char[] arr, char c){
        for (char c1 : arr) {
            if (c1 == c){
                return true;
            }
        }
        return false;
    }

}