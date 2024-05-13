class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            sum += Integer.parseInt(str.charAt(i)+"");
        }
        
        return x % sum == 0 ? true : false;
    }
}