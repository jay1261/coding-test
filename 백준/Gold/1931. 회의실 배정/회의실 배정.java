import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Node[] arr = new Node[n];
        

        for(int i = 0; i < n; i++){
            String[] splited = sc.nextLine().split(" ");
            int startTime = Integer.parseInt(splited[0]);
            int endTime = Integer.parseInt(splited[1]);

            arr[i] = new Node(startTime, endTime);
        }

        Arrays.sort(arr, (o1, o2) -> Integer.compare(o1.startTime, o2.startTime));
        Arrays.sort(arr, (o1, o2) -> Integer.compare(o1.endTime, o2.endTime));

        int count = 1;        
        Node before = arr[0];
        for(int i = 1; i < n; i++){
            if(before.endTime <= arr[i].startTime){
                count++;
                before = arr[i];
            }
        }
        
        System.out.println(count);
	}
    
    static class Node{
        int startTime;
        int endTime;
        
        public Node(int startTime, int endTime){
            this.startTime = startTime;
            this.endTime = endTime;
        }
 
    }
}