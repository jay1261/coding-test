import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] houses = new int[n];
        
        for(int i = 0; i < n; i++){
            houses[i] = sc.nextInt();
        }
        Arrays.sort(houses);
        
        int left = 1;
        int right = houses[n-1] - houses[0];
        int answer = 0;
        while(left <= right){
            int mid = (left + right) / 2;
            int count = getCount(houses, mid);
            
            if(count < c){
                right = mid - 1;
            } else {
                left = mid + 1;
                answer = mid;
            }
            
        }
        
        System.out.println(answer);
        
	}
    
    public static int getCount(int[] houses, int length){
        int temp = houses[0];
        int count = 1;
        for(int i = 1; i < houses.length; i++){
            if(temp + length <= houses[i]){
                temp = houses[i];
                count++;                
            }
        }
        return count;
    }
}