import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main6 {
//    public static String solution(String str) {
//        Set<Character> uniqueChars = new HashSet<>(); // 중복 체크용 Set
//        StringBuilder answer = new StringBuilder();
//
//        for (char c : str.toCharArray()) {
//            if (!uniqueChars.contains(c)) {  // 중복되지 않은 경우 추가
//                uniqueChars.add(c);
//                answer.append(c);
//            }
//        }
//        return answer.toString();
//    }

    // 강의 풀이 방식
    public static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }
}
