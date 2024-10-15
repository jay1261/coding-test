class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};        
        
        for(int i = (brown - 2) / 2; i >= 3; i--){
            // System.out.println("i = " + i); 
            // i = width
            int h = (brown - (i*2)) / 2 + 2;
            // System.out.println("h = " + h);
            
            // System.out.println("(i-2) * (h-2) = " + (i-2) * (h-2));
            if((i-2) * (h-2) == yellow){
                answer = new int[]{i, h};
                return answer;
            }
        }
        

        return answer;
    }
}

// 3*2 + 3 * 2 - 2

// 12 - 6 = 6 + 4 / 2
    
// 0 0 0 0 0 
// 0 x x x 0
// 0 0 0 0 0   

// 0 0 0 0
// 0 x x 0
// 0 0 0 0 

// 0 0 0
// 0 x 0
// 0 0 0
    
// 0 0 0 0 0 0 0 0
// 0 x x x x x x 0
// 0 x x x x x x 0
// 0 0 0 0 0 0 0 0