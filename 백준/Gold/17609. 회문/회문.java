import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++){
            System.out.println(solution(sc.nextLine()));
        }

	}
    
    public static int solution(String str){
        int start = 0;
        int end = str.length()-1;
        
        while(start < end){    
            if(str.charAt(start) != str.charAt(end)){
                if(isPalindrome(str, start+1, end) || isPalindrome(str, start, end - 1)){
                    return 1;
                } else {
                    return 2;
                }
            }
            start++;
            end--;
        }
        
        return 0;
    }
        
    public static boolean isPalindrome(String str, int start, int end){
        while(start < end){    
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
    
    
}