import java.util.Scanner;

public class Main1_6 {
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
    public static String solution(String str) { // indexOf 활용하기
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            int uniqueIndex = str.indexOf(str.charAt(i)); // 같은 문자가 여러번 있으면 가장 앞에 있는 문자의 인덱스를 반환
            if (uniqueIndex == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }
}
