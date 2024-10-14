class Solution {
    public String solution(String s) {
        String[] splited = s.split(" ");
        int max = Integer.valueOf(splited[0]);
        int min = Integer.valueOf(splited[0]);
        for(String str: splited){
            if(max < Integer.valueOf(str)){
               max = Integer.valueOf(str);
            }
            if(min > Integer.valueOf(str)){
                min = Integer.valueOf(str);
            }
        }
        
        return String.valueOf(min) + " " + String.valueOf(max);
    }
}