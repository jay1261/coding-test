import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        int[] tmp = {0,0,0};
        for(int i = 0; i < answers.length; i++){
            // 1번말
            // System.out.println(a[i % a.length]);
            if(answers[i] == a[i % a.length]){
                tmp[0]++;
            }
            // 2번말
            // System.out.println(b[i % b.length]);
            if(answers[i] == b[i % b.length]){
                tmp[1]++;
            }
            // 3번말
            // System.out.println(c[i % c.length]);
            if(answers[i] == c[i % c.length]){
                tmp[2]++;
            }
        }
        
        int max = -1;
        for(int i: tmp){
            if(max < i){
                max = i;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < tmp.length; i++){
            if(max == tmp[i]){
                ans.add(i + 1);
            }
        }
        
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}