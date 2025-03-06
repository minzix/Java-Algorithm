import java.util.Scanner;

public class Main8 {
    public static String solution(String str) {
        str = str.toLowerCase(); // 소문자로 통일하기
        char[] chars = str.toCharArray(); // 문자열 -> 문자 배열으로 변환
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
                continue;
            }

            if (!Character.isLetter(chars[right])) {
                right--;
                continue;
            }
            if (chars[left] != chars[right]) {
                return "NO";
            }
            left++;
            right--;
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }
}
