import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int index = 0;
        int number = 1;
        StringBuilder sb = new StringBuilder();
        while(index < n){
            if(!stack.isEmpty() && stack.peek() == arr[index]){
                stack.pop();
                sb.append("-\n");
                index++;
            } else {
                stack.push(number++);
                sb.append("+\n");
            }

            if(number > n+1){
                sb = new StringBuilder();
                sb.append("NO");
                break;
            }
        }
        System.out.println(sb.toString());
    }
}