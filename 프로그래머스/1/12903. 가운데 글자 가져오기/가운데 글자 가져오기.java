class Solution {
    public String solution(String s) {
        int mid  = s.length() / 2;
        
        return s.length() % 2 == 0 ?  "" + s.charAt(mid-1) + s.charAt(mid)  : "" + s.charAt(mid);
    }
}