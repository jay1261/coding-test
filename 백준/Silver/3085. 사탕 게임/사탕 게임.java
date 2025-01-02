import java.util.*;

class Main{
    static char[][] map;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        map = new char[n][n];

        for(int i = 0; i < n; i++){
            map[i] = sc.nextLine().toCharArray();
        }

        int answer = 0;
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {

                // 오른쪽
                if(j + 1 < n && map[i][j] != map[i][j+1]){
                    char tmp = map[i][j];
                    map[i][j] = map[i][j+1];
                    map[i][j+1] = tmp;

                    answer = Math.max(answer, check());

                    tmp = map[i][j];
                    map[i][j] = map[i][j+1];
                    map[i][j+1] = tmp;
                }

                // 아래
                if(i + 1 < n && map[i][j] != map[i+1][j]){
                    char tmp = map[i][j];
                    map[i][j] = map[i+1][j];
                    map[i+1][j] = tmp;

                    answer = Math.max(answer, check());

                    tmp = map[i][j];
                    map[i][j] = map[i+1][j];
                    map[i+1][j] = tmp;
                }
            }
        }



        System.out.println(answer);
    }

    public static int check(){
        int max = 0;

        for (int i = 0; i <map.length; i++) {
            int rCount = 0;
            int cCount = 0;
            char rTmp = map[i][0];
            char cTmp = map[0][i];

            for(int j = 0; j < map.length; j++){
                if(rTmp == map[i][j]){
                    rCount++;
                } else if(rTmp != map[i][j]){
                    max = Math.max(max, rCount);
                    rCount = 1;
                    rTmp = map[i][j];
                }

                if(cTmp == map[j][i]){
                    cCount++;
                } else if(cTmp != map[j][i]){
                    max = Math.max(max, cCount);
                    cCount = 1;
                    cTmp = map[j][i];
                }
            }
            max = Math.max(max, rCount);
            max = Math.max(max, cCount);
        }

        return max;
    }
}