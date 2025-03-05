import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main6 {
    public static String solution(String str) {
        Set<Character> uniqueChars = new HashSet<>(); // 중복 체크용 Set
        StringBuilder answer = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!uniqueChars.contains(c)) {  // 중복되지 않은 경우 추가
                uniqueChars.add(c);
                answer.append(c);
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }
}
