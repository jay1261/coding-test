import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++){
            String input = sc.nextLine();
            int answer = palindrome(input);
            sb.append(answer).append("\n");
        }
        
        System.out.println(sb);
	}
    
    public static int palindrome(String input){
        int length = input.length();
        int left = 0;
        int right = length - 1;

        while(left < right){
            // 둘이 같을때 그냥 둘다 이동
            if(input.charAt(left) == input.charAt(right)){
                left++;
                right--;
            }
            // 둘이 다를 때 
            // 1. left를 증가하면 같아질 때 
            // 2. right를 감소하면 같아질 때
            // 3. 위 둘다 안될 때
            else {
                if(isPalindrome(input, left + 1, right) || isPalindrome(input, left, right - 1)){
                    return 1;
                } else {
                    return 2;
                }
            }
        }
        return 0;
    }
    
    public static boolean isPalindrome(String str, int left, int right){
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    // xabcba
    // acc
    // a b xbb x a
    // 0 1 234 5 6
    // 1 4  
    // abxxbxa
    // gbedbg f
    // abca
}