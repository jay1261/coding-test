class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;

        for (int i = n - 2; i >= 0; i--) { // 아래에서 위로
            for (int j = 0; j < triangle[i].length; j++) {
                // 아래 행의 두 값 중 최대값을 더함
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }

        return triangle[0][0]; // 최종 결과
    }
}