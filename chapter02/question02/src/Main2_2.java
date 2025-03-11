import java.util.Scanner;

public class Main2_2 {
    public static int solution(int N, int[] arr) {
        int visible = 1; // 첫 번째 학생은 무조건 보임
        int maxHeight = arr[0]; // 현재까지 가장 키가 큰 학생

        for (int i = 1; i < N; i++) { // 첫 번째 학생은 이미 보이므로 1부터 순회
            if (arr[i] > maxHeight) { // 현재 학생이 가장 큰 경우
                visible++;  // 보이는 학생 수 증가
                maxHeight = arr[i]; // maxHeight 갱신
            }
        }
        return visible;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 학생 수 입력
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt(); // 학생 키 입력
        }

        System.out.println(solution(N, arr)); // 결과 출력
        scanner.close(); // Scanner 닫기
    }
}
