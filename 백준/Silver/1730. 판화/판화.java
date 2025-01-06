import java.util.*;

class Main{    
    static char[][] map;
    static HashMap<Character, Character> hashMap = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        char[] inputs = sc.nextLine().toCharArray();

        map = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(map[i], '.');
        }
        hashMap.put('D', '|');
        hashMap.put('U', '|');
        hashMap.put('L', '-');
        hashMap.put('R', '-');

        // 시작점
        int cx = 0;
        int cy = 0;
        for (char input : inputs) {
            int nx = cx;
            int ny = cy;
            switch (input){
                case 'D':
                    nx = cx + 1;
                    break;
                case 'U' :
                    nx = cx - 1;
                    break;
                case 'R':
                    ny = cy + 1;
                    break;
                case 'L' :
                    ny = cy - 1;
                    break;
            }

            if(nx < n && nx >= 0 && ny < n && ny >= 0){
                draw(cx, cy, input);
                draw(nx, ny, input);
                cx = nx;
                cy = ny;
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println("");
        }


    }

    public static void draw(int x, int y, char direction){
        if(map[x][y] == '.'){
            map[x][y] = hashMap.get(direction);
        } else if(map[x][y] == '|' && hashMap.get(direction) == '-'){
            map[x][y] = '+';
        } else if(map[x][y] == '-' && hashMap.get(direction) == '|'){
            map[x][y] = '+';
        }
    }
}