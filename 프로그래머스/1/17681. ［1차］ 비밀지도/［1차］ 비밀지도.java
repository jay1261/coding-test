class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++){
            String bi1 = "";
            while(arr1[i] > 0){
                bi1 = arr1[i] % 2 + bi1;
                arr1[i] /= 2;
            }
            
            String bi2 = "";
            while(arr2[i] > 0){
                bi2 = arr2[i] % 2 + bi2;
                arr2[i] /= 2;
            }
            
            bi1 = "0".repeat(n - bi1.length()) + bi1;
            bi2 = "0".repeat(n - bi2.length()) + bi2;
            
            String tmp = "";
            for(int j = 0; j < n; j++){
                if(bi1.charAt(j) == '1' || bi2.charAt(j) == '1'){
                    tmp += "#";
                } else {
                    tmp += " ";
                }
            }
            
            answer[i] = tmp;
        }
        return answer;
    }
}