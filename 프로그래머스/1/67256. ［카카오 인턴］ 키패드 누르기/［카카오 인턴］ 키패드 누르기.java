class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        // 1  2  3
        // 4  5  6
        // 7  8  9
        // 10 11 12
        int currentLeft = 10;
        int currentRight = 12;
        // 현재 왼손 위치, 오른손 위치 
        for(int i = 0; i < numbers.length; i++){
            int target = numbers[i] == 0 ? 11 : numbers[i];
            
            if(target == 1 || target == 4 || target == 7){
                currentLeft = target;
                sb.append("L");
            }
            
            else if(target == 3 || target == 6 || target == 9){
                currentRight = target;
                sb.append("R");
            }
            
            else {
                int l = findWay(currentLeft, target);
                int r = findWay(currentRight, target);
                // System.out.println("left: " + l);
                // System.out.println("right: " + r);
                if(l == r){
                    if(hand.equals("left")){
                        sb.append("L");    
                        currentLeft = target;
                    } else {
                        sb.append("R");  
                        currentRight = target;
                    }

                }
                else if(l < r){
                    sb.append("L");
                    currentLeft = target;
                } else {
                    sb.append("R");
                    currentRight = target;
                }
            }
        }
        
        // 2,4,5,0일 때 눌러야 할 숫자의 거리 구하기
        // 같으면 hand 손 
        // 다르면 작은값의 손
        
        return sb.toString();
    }
    
    public int findWay(int current, int target){
        int count = 0;
        int tmp = current;
        
        while(tmp != target){
            if(current < target){
                if(tmp + 3 <= target){
                    tmp += 3;
                } else if(tmp + 3 > target){
                    tmp += 1;
                }
                count++;
            } else {
                if(tmp - 3 >= target) {
                    tmp -= 3;
                } else if(tmp - 3 < target) {
                    tmp -= 1;
                }
                count++;
            }
        }
        return count;
    }
}