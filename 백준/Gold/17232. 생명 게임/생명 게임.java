import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();

        String[][] board = new String[n+1][m+1];
        int[][] prefixBoard = new int[n+1][m+1];

        for(int i = 1; i <= n; i++){
            String[] splited = sc.nextLine().split("");
            for (int j = 1; j <= m; j++) {
                board[i][j] = splited[j-1];
                int current = board[i][j].equals("*") ? 1 : 0;
                prefixBoard[i][j] = prefixBoard[i-1][j] + prefixBoard[i][j-1] - prefixBoard[i-1][j-1] + current;
            }
        }


        for(int i = 0; i < t; i++){
            for(int j = 1; j <= n; j++){
                for (int l = 1; l <= m; l++) {
                    int aroundLifeCount = getAroundLifeCount(board, prefixBoard, j, l, k);


                    if(board[j][l].equals("*")){
                        if(a > aroundLifeCount || aroundLifeCount > b){
                            board[j][l] = ".";
                        }
                    } else {
                        if(a < aroundLifeCount && aroundLifeCount <= b){
                            board[j][l] = "*";
                        }
                    }

                }
            }

            for(int j = 1; j <= n; j++){
                for (int l = 1; l <= m; l++) {
                    int current = board[j][l].equals("*") ? 1 : 0;
                    prefixBoard[j][l] = prefixBoard[j-1][l] + prefixBoard[j][l-1] - prefixBoard[j-1][l-1] + current;
                }
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }

    public static int getAroundLifeCount(String[][] board, int[][] prefixBoard, int x, int y, int k){
        int x1 = Math.max(x - k, 1);
        int y1 = Math.max(y - k, 1);
        int x2 = Math.min(x + k, prefixBoard.length - 1);
        int y2 = Math.min(y + k, prefixBoard[0].length - 1);
        int current = board[x][y].equals("*") ? 1 : 0;

        return prefixBoard[x2][y2] - prefixBoard[x1-1][y2] - prefixBoard[x2][y1-1] + prefixBoard[x1-1][y1-1] - current;
    }
}
