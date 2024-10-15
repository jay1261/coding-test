import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Integer[] arr = new Integer[B.length];
        for(int i = 0; i < B.length; i++){
            arr[i] = B[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int answer = 0;
            
        for(int i = 0; i < A.length; i++){
            answer += A[i] * arr[i];
        }

        return answer;
    }
}