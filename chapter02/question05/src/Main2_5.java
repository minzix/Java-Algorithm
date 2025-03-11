import java.util.Arrays;
import java.util.Scanner;

// 잘 모르겠음.. 강의 다시 들어볼것!
public class Main2_5 {
    public static int solution(int N) {
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true); // 처음에는 모든 수를 소수(true)로 가정
        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아님

        for (int i = 2; i * i <= N; i++) { // √N까지만 검사
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) { // 배수 지우기
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (isPrime[i]) count++; // 소수 개수 세기
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(solution(N));
    }
}
