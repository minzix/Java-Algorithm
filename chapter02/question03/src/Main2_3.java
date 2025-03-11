import java.util.Scanner;

public class Main2_3 {
    public static void solution(int N, int[] A, int[] B) {
        // 1:가위, 2:바위, 3:보
        for (int i = 0; i < N; i++) {
            if (A[i] == B[i]) {
                System.out.println("D");
            } else if ((A[i] == 1 && B[i] == 3) || (A[i] == 2 && B[i] == 1) || (A[i] == 3 && B[i] == 2)) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }
        solution(N, A, B);
    }
}
