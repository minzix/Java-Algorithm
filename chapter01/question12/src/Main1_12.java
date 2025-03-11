import java.util.Scanner;

public class Main1_12 {
    public static String solution(int num, String str) {
        StringBuilder answer = new StringBuilder();
        int length = str.length() / num; // 한 문자당 몇 개의 기호가 사용되는지 계산

        for (int i = 0; i < num; i++) {
            String temp = str.substring(i * length, (i + 1) * length)
                    .replace("#", "1")
                    .replace("*", "0"); // 2진수 변환

            int tempNum = Integer.parseInt(temp, 2); // 2진수를 10진수로 변환
            answer.append((char) tempNum); // 10진수를 문자로 변환하여 추가
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        String str = scanner.nextLine();
        System.out.println(solution(num, str));

        scanner.close();
    }
}
