import java.util.Scanner;

public class Main2_4 {
    public static String solution(int n){
        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fibonacci.length; i++) {
            sb.append(fibonacci[i]);
            if (i < fibonacci.length - 1) { // 마지막 원소 뒤에는 공백 추가 안 함
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solution(n));
    }
}
