import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int p = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        //A C G T
        int[] arr = new int[4];
        int sum = 0;
        for(int i = 0; i < 4; i++){
            int num = sc.nextInt();
            arr[i] = num;
            sum += num;
        }
        int answer = 0;
        
        //처음 subString
        String subStr = input.substring(0, p);
        for(char c: subStr.toCharArray()){
            int index = getIndex(c);

            if(index != -1){
                if(arr[index] > 0) sum--;
                arr[index]--;
            }
            
        }
        if(sum == 0){
            answer++;
        }

        // 하나씩 추가하고 빼기
        
        for(int i = 0; i < s-p; i++){
            char c = input.charAt(i);
            int index = getIndex(c);
            
            if(index != -1){
                arr[index]++;
                if(arr[index] > 0){
                    sum++;
                }
            }
            
            char c2 = input.charAt(i+p);
            int index2 = getIndex(c2);
            
            if(index2 != -1){
                if(arr[index2] > 0){
                    sum--;
                }
                arr[index2]--;
            }
            
            if(sum == 0){
                answer++;
            }
        }
        


        System.out.println(answer);
	}
    
    public static int getIndex(char c){
        switch (c){
            case 'A':
                return 0;
            case 'C':
                return 1;
            case 'G':
                return 2;
            case 'T':
                return 3;
            default:
                return -1;
        }
    }
}