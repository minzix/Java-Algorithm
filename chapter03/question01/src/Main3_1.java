import java.util.Arrays;
import java.util.Scanner;

public class Main3_1 {
    public static int[] solution(int[] arrN, int[] arrM) {
        int[] mergedArray = new int[arrN.length + arrM.length];
        // 첫 번째 배열 복사
        System.arraycopy(arrN, 0, mergedArray, 0, arrN.length);
        // 두 번째 배열 복사
        System.arraycopy(arrM, 0, mergedArray, arrN.length, arrM.length);
        Arrays.sort(mergedArray);
        return mergedArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arrN = new int[N];
        for (int i = 0; i < N; i++) {
            arrN[i] = scanner.nextInt();
        }
        int M = scanner.nextInt();
        int[] arrM = new int[M];
        for (int i = 0; i < M; i++) {
            arrM[i] = scanner.nextInt();
        }
        for (int num : solution(arrN, arrM)) {
            System.out.print(num + " ");
        }
    }
}


