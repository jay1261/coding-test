class Solution {
    public long solution(String numbers) {
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < str.length; i++){
            numbers = numbers.replace(str[i], String.valueOf(i));
        }
        
        
        return Long.parseLong(numbers);
//         long answer = 0;
//         String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//         StringBuilder sb = new StringBuilder(numbers);
        
        
//         for(String s: str){
//             while(sb.indexOf(s) != -1){
//                 int index = sb.indexOf(s);
//                 String numStr = switchNumber(s);
//                 sb.replace(index, index + s.length(), numStr);
//             }
//         }
        
//         return Long.parseLong(sb.toString());
    }
    
//     public static String switchNumber(String str){
//         return switch (str){
//                 case "zero" -> "0";
//                 case "one" -> "1";
//                 case "two" -> "2";
//                 case "three" -> "3";
//                 case "four" -> "4";
//                 case "five" -> "5";
//                 case "six" -> "6";
//                 case "seven" -> "7";
//                 case "eight" -> "8";
//                 case "nine" -> "9";
//                 default -> "";
//         };
        
//     }
}

