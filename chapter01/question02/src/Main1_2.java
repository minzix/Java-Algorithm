import java.util.Scanner;

public class Main1_2 {
    public static String solution(String S) { // StringBuilder
        // StringBuilder result = new StringBuilder();
        String answer = "";

        // 대문자는 소문자로 소문자는 대문자로 변환
        for (char c : S.toCharArray()) {
            if (Character.isLowerCase(c)) {
                // result.append(Character.toUpperCase(c));
                answer += Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                // result.append(Character.toLowerCase(c));
                answer += Character.toLowerCase(c);
            }
        }
        // return result;
        return answer;
    }

    public static void main(String[] args) {
        // 입력
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        // 정답 출력
        System.out.println(solution(s));
    }
}
