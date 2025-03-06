import java.util.Scanner;

public class Main1_3 {
    public static String solution(String str) {
        // 특정 구분자로 문자열을 나누기 위해 split 사용하기 (결과값은 배열)
        String[] words = str.split(" ");
        String result = "";
        for (String word : words) {
            if (result.length() < word.length()) {
                result = word;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(solution(str));
    }
}
