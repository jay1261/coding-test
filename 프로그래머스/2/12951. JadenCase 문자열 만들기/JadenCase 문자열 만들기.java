class Solution {
    public String solution(String s) {
        char[] cArr = s.toCharArray();
        boolean isFirst = true;
        
        for(int i = 0; i < cArr.length; i++){
            if (cArr[i] == ' '){
                isFirst = true;
                continue;
            }
            if(isFirst){
                isFirst = false;
                cArr[i] = Character.toUpperCase(cArr[i]);
            } else {
                cArr[i] = Character.toLowerCase(cArr[i]);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cArr.length; i++){
            sb.append(cArr[i]);
        }
        
        return sb.toString();
    }
}