import java.util.Scanner;

public class Main2_11 {
    // i값이 같은 열끼리 순회하며 비교해서 만약 값이 서로 같은 경우가 있다면 해당 학생의 배열에 (j번..) ++로 증가시키기
    public static int solution(int N, int[][] matrix) {
        int answer = 0;
        int[] student = new int[N];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                // 여기에서 matrix[i][j]랑 matrix[i][j + 1]랑 ... 비교해가며 만약 같은 원소가 존재 하면
                // student[j]++;를 해줘야 함
            }
        }
        for (int i = 1; i < student.length; i++) {
            if (student[i] > student[answer]) {
                answer = i;
            }
        }
        return answer + 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solution(N, matrix));
    }
}
