import java.util.ArrayList;
import java.util.Scanner;

public class Main2_6 {
    public static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    // 5번 강의 듣고 나서 다시 보기
    public static ArrayList<Integer> solution(int N, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 뒤집은 결과가 소수이면 answer에 담아서 반환해보자!
        for (int i = 0; i < N; i++) {
            int temp = arr[i];
            int result = 0;
            while (temp > 0) {
                // 예: temp = 123
                int end = temp % 10; // temp의 일의 자리 반환 | end = 3 | end = 2 | end = 1
                result = result * 10 + end; // end를 일의자리에 붙여넣기 위해 기존의 result에 10을 곱함 | result = 3 | result = 30 + 2 | result = 320 + 1
                temp /= 10; // temp의 일의 자리 지우기 (10으로 나눈 몫이므로) // temp = 12 | temp = 1 | temp = 0
            }
            if (isPrime(result)) {
                answer.add(result);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int num : solution(N, arr)) {
            System.out.print(num + " ");
        }
    }
}
