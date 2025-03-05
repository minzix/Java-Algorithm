import java.util.Scanner;

public class Main2 {
    public static StringBuilder solution(String S) {
        // String은 수정이 불가하므로 StringBuilder 사용
        StringBuilder result = new StringBuilder();

        // 대문자는 소문자로 소문자는 대문자로 변환
        for (char c : S.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // 입력
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        // 정답 출력
        System.out.println(solution(s));
    }
}
