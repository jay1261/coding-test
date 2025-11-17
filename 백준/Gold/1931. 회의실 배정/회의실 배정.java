import java.util.*;

class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        
        for(int i = 0; i < n; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr[i][0] = start;
            arr[i][1] = end;
        }
        //Arrays.sort(arr, (o1, o2) -> Integer.compare(o1[1]-o1[0], o2[1] -o2[0]));
        Arrays.sort(arr, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        Arrays.sort(arr, (o1, o2) -> Integer.compare(o1[1], o2[1]));

        //for(int i = 0; i < n; i++){
        //    System.out.println("[" + arr[i][0] + ", " + arr[i][1] + "]");
        //}
        // 시작시간 
        // 끝나는 시간
        // 회의시간
        int endTime = arr[0][1];
        int answer = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i][0] >= endTime){
                endTime = arr[i][1];
                answer++;
            }
        }
        System.out.println(answer);
    }
}
