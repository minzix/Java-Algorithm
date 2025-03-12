import java.util.Scanner;

public class Main2_1 {
    public static StringBuilder solution(int[] A) {
        StringBuilder answer = new StringBuilder();
        answer.append(A[0]).append(" ");
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] < A[i]) {
                answer.append(A[i]).append(" ");
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] A = new int[num];
        for (int i = 0; i < num; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(solution(A));
    }
}
