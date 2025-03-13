import java.util.Scanner;

public class Main2_10 {
    public static int solution(int N, int[][] grid){
        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 가장자리의 outofbound 오류 어떻게 해결하지? -> 강의 듣기
            }
        }
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
