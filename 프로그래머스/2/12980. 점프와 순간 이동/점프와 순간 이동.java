import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");
        while(n > 0){
            if(n % 2 == 1){
                ans++;
            }
            n = n / 2;
            
        }
        return ans;
    }
}