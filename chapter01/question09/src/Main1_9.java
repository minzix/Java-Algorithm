import java.util.Scanner;

public class Main1_9 {
    public static String solution(String str) {
        char[] chars = str.toCharArray();
        StringBuilder result = new StringBuilder();
        // 1. 문자열 중 숫자만 추출
        for (char c : chars) {
            if (!Character.isLetter(c)) {
                result.append(c);
            }
        }
        // 2. 0이 가장 앞에 있을 경우 삭제 (while로 처리해서 연달아 있는 경우 대비)
        while (result.charAt(0) == '0') {
            // 여기서, 자바에서는 같은 타입끼리만 비교할 수 있으므로 "0"이 아닌 '0'이라고 적어야 함
            result.deleteCharAt(0);
        }

        return new String(result);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }
}
