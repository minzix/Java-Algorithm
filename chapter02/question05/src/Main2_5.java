import java.util.Scanner;

public class Main2_5 {
    public static int solution(int N) {
        int answer = 0;
        int[] arr = new int[N + 1]; // 0 ~ N 까지의 수를 모두 검사하기 위해!
        // 이 때, 자바에서 int 타입 배열을 선언하면 자동으로 0들로 초기화됨!
        for (int i = 2; i <= N; i++) {
            // 0, 1은 당연히 소수가 아니므로 검사하는 것이 무의미해서 for 문에서 배제함

            // 이 때, arr[i] == 1: false, arr[i] == 0: true 로 이해해야 함
            if (arr[i] == 0) { // 따라서 아직 1로 바뀌지 않은 arr[i]들은 무조건 다 0일 것.
                answer++;
                for (int j = i; j <= N; j = j + i) {
                    arr[j] = 1; // 소수가 아니라는 표시
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(solution(N));
    }
}
