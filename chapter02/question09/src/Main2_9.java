import java.util.Scanner;

public class Main2_9 {
    public static int solution(int N, int[][] grid){
        int answer = 0;
        int tempDiag1 = 0;
        int tempDiag2 = 0;

        for (int i = 0; i < N; i++) {
            int tempRow = 0;
            int tempCol = 0;
            for (int j = 0; j < N; j++) {
                tempRow += grid[i][j];
                tempCol += grid[j][i];
            }
            tempDiag1 += grid[i][i]; // 주대각선 합 (좌상단 -> 우하단)
            tempDiag2 += grid[i][N - i - 1]; // 부대각선 합 (우상단 -> 좌하단)
            answer = Math.max(answer, tempRow);
            answer = Math.max(answer, tempCol);
        }
        answer = Math.max(answer, tempDiag1);
        answer = Math.max(answer, tempDiag2);
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] grid = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solution(N, grid));
    }
}
