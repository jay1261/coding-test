import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        
        // System.out.println((int)'z');
        // System.out.println((int)'a');
        for(int i = 0; i < str1.length()-1; i++){
            char c1 = Character.toLowerCase(str1.charAt(i));
            char c2 = Character.toLowerCase(str1.charAt(i+1));
            
            if(97 <= c1 && c1 <= 122 && 97 <= c2 && c2 <= 122){
                A.add(c1+""+c2);    
            }
        }
        
        for(int i = 0; i < str2.length()-1; i++){
            char c1 = Character.toLowerCase(str2.charAt(i));
            char c2 = Character.toLowerCase(str2.charAt(i+1));
            
            if(97 <= c1 && c1 <= 122 && 97 <= c2 && c2 <= 122){
                B.add(c1+""+c2);    
            }
        }
        
        // System.out.println(A.toString());
        // System.out.println(B.toString());
        
        int answer = 0;
        return (int)(J(A, B) * 65536);
    }
    
    public Double J(ArrayList<String> A, ArrayList<String> B){
        
        if(A.isEmpty() && B.isEmpty()){
            return 1.0;
        }
        
        LinkedList<String> aList = new LinkedList<>(A);
        LinkedList<String> bList = new LinkedList<>(B);
        
        ArrayList<String> intersection = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();
        // 교집합 구하기
        for(int i = aList.size()-1; i >= 0; i--){
            String s = aList.get(i);
            if(bList.contains(s)){
                intersection.add(s);
                aList.remove(s);
                bList.remove(s);
            }
        }
        
        aList = new LinkedList<>(A);
        bList = new LinkedList<>(B);
        // 합집합 구하기
        for(int i = aList.size()-1; i >= 0; i--){
            String s = aList.get(i);
            if(bList.contains(s)){
                union.add(s);
                aList.remove(s);
                bList.remove(s);
            } else {
                union.add(s);
            }
        }
        for(int i = bList.size()-1; i >= 0; i--){
            String s = bList.get(i);
            union.add(s);
        }
        
        // System.out.println(intersection.toString());
        // System.out.println(union.toString());

        
        return (double)intersection.size() / union.size();
    }
}



//J(A, B)는 두 집합의 교집합 크기를 두 집합의 합집합 크기로 나눈 값으로 정의된다.