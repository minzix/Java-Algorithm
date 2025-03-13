import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main3_2 {
    // 내 풀이: 람다식 때문인지 시간초과 두개 뜸,,
    public static ArrayList<Integer> solution(int[] arrN, int[] arrM) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < arrN.length; i++) {
            int idx = i;
            if (Arrays.stream(arrM).anyMatch(num -> num == arrN[idx])){
                answer.add(arrN[idx]);
            }
        }
        answer.sort(Integer::compareTo);
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int M = scanner.nextInt();
        int[] arrM = new int[M];
        for (int i = 0; i < M; i++) {
            arrM[i] = scanner.nextInt();
        }
        for (Integer num : solution(arr, arrM)) {
            System.out.print(num + " ");
        }
    }
}
