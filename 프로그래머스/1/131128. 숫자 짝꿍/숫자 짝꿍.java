import java.util.*;
// System.out.println();

class Solution {
    public String solution(String X, String Y) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] xArr = X.toCharArray();
        char[] yArr = Y.toCharArray();
        Arrays.sort(xArr);
        Arrays.sort(yArr);
        int xIdx = xArr.length-1;
        int yIdx = yArr.length-1;
        
        while(xIdx >= 0 && yIdx >= 0){
            if(xArr[xIdx] == yArr[yIdx]){
                map.put(xArr[xIdx], map.getOrDefault(xArr[xIdx], 0) + 1);
                xIdx--;
                yIdx--;
            } else if(xArr[xIdx] > yArr[yIdx]){
                xIdx--;
            } else if(xArr[xIdx] < yArr[yIdx]){
                yIdx--;
            }
        }
        
        
        // for(int i = 0; i < xArr.length; i++){           
        //     for(int j = 0; j < yArr.length; j++){
        //         if(xArr[i] == yArr[j]){
        //             map.put(xArr[i], map.getOrDefault(xArr[i], 0) + 1);
        //             yArr[j] = ' ';
        //             break;
        //         }
        //     }
        // }

        // System.out.println(map.keySet());
        List<Character> list = new ArrayList<>(map.keySet());
        if(list.isEmpty()){
            return "-1";
        }
        
        list.sort((o1,o2) -> Integer.compare(Integer.valueOf(o2), Integer.valueOf(o1)));
        StringBuilder sb = new StringBuilder();
        
        for(Character c: list){
            sb.append((c+"").repeat(map.get(c)));
        }
        
        if(sb.toString().charAt(0) == '0'){
            return "0";
        }
        return sb.toString();
    }
}