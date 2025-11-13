import java.util.*;

class Main{
    static int n;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        
        char[][] arr = new char[n][n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLine().toCharArray();
        }
        
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                char current = arr[i][j];
                // 오른쪽
                if(j+1 < n){
                    //스왑
                    char temp = arr[i][j+1];
                    arr[i][j+1] = arr[i][j];
                    arr[i][j] = temp;
                    
                    // 체크
                    max = Math.max(max, check(arr, i, j, i, j+1));
                    
                    //되돌리기
                    temp = arr[i][j+1];
                    arr[i][j+1] = arr[i][j];
                    arr[i][j] = temp;
                }
                
                
                // 아래
                if(i+1 < n){
                    char temp = arr[i+1][j];
                    arr[i+1][j] = arr[i][j];
                    arr[i][j] = temp;
                    
                    max = Math.max(max, check(arr, i, j, i+1, j));

                    temp = arr[i+1][j];
                    arr[i+1][j] = arr[i][j];
                    arr[i][j] = temp;
                }
            }
            
        }
        System.out.println(max);

    }
    
    public static int check(char[][] arr, int x1, int y1, int x2, int y2){
        int max = 0;
        // 가로 교환
        if(x1 == x2){
            //x1한줄
            int x1Count = 1;
            int y1Count = 1;
            int y2Count = 1;
            for(int i = 1; i < n; i++){
                if(arr[x1][i-1] == arr[x1][i]){
                    x1Count++;
                } else {
                    max = Math.max(max, x1Count);
                    x1Count = 1;
                }

                if(arr[i-1][y1] == arr[i][y1]){
                    y1Count++;
                } else {
                    max = Math.max(max, y1Count);
                    y1Count = 1;
                }

                if(arr[i-1][y2] == arr[i][y2]){
                    y2Count++;
                } else {
                    max = Math.max(max, y2Count);
                    y2Count = 1;
                }
            }
            //y1한줄
            //y2한줄
            max = Math.max(max,x1Count);
            max = Math.max(max,y1Count);
            max = Math.max(max,y2Count);
        }

        if(y1 == y2){
            // 세로교환
            //y1한줄
            //x1한줄
            //x2한줄

            int y1Count = 1;
            int x1Count = 1;
            int x2Count = 1;
            for(int i = 1; i < n; i++){
                if(arr[i-1][y1] == arr[i][y1]){
                    y1Count++;
                } else {
                    max = Math.max(max, y1Count);
                    y1Count = 1;
                }

                if(arr[x1][i-1] == arr[x1][i]){
                    x1Count++;
                } else {
                    max = Math.max(max, x1Count);
                    x1Count = 1;
                }

                if(arr[x2][i-1] == arr[x2][i]){
                    x2Count++;
                } else {
                    max = Math.max(max, x2Count);
                    x2Count = 1;
                }
            }
            max = Math.max(max,y1Count);
            max = Math.max(max,x1Count);
            max = Math.max(max,x2Count);
        }

        return max;
    }
}