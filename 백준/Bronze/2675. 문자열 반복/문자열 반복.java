import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 수 입력
        
        for (int i = 0; i < t; i++) {
            String[] splited = br.readLine().split(" ");
            int n = Integer.parseInt(splited[0]);
            String str = splited[1];
            
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < n; k++) {
                    result.append(str.charAt(j)); // 반복된 문자 추가
                }
            }
            System.out.println(result.toString()); // 최종 결과 출력
        }
    }
}
