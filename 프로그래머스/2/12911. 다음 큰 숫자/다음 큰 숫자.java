class Solution {
    public int solution(int n) {
        String binary = Integer.toBinaryString(n);
        
        boolean foundFirst = false;
        int oneCount = 0;
        int index = -1;
        for(int i = binary.length()-1; i >= 0; i--){
            if(!foundFirst && binary.charAt(i) == '1'){
                foundFirst = true;
                
            } else if(foundFirst && binary.charAt(i) == '1'){
                oneCount++;
            } else if(foundFirst && binary.charAt(i) == '0'){
                index = i;
                break;
            }
        }


        
        StringBuilder sb = new StringBuilder();
        
        if(index == -1){
            sb.append('1');
        }

        for(int i = 0; i < binary.length(); i++){
            if(index > i){
                sb.append(binary.charAt(i));
            } else if(index == i){
                sb.append('1');
            } else if(binary.length() - oneCount <= i){
                sb.append('1');
            } else {
                sb.append('0');
            }

        }
        

        String nextBinary = sb.toString();
        int answer = 0;
        for(int i = nextBinary.length()-1; i >= 0 ; i--){
            char c = nextBinary.charAt(i);
            if(c == '1'){
                answer += Math.pow(2,nextBinary.length()-i-1);
            }
        }
                
        return answer;
    }
}

// 1001110
    
// 1010011
// 1111
    
// 0001=1
// 0010=2
    
// 1001 = 9
// 1010 = 10

// 1010 = 10
//  1100 = 12
// 10001
    
