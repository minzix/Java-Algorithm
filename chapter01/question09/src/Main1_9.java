import java.util.Scanner;

public class Main1_9 {
    // 내 풀이 (=강의 두번째 풀이)
//    public static String solution(String str) {
//        char[] chars = str.toCharArray();
//        StringBuilder result = new StringBuilder();
//        // 1. 문자열 중 숫자만 추출
//        for (char c : chars) {
//            if (!Character.isLetter(c)) { // if (c >= 48 && c <= 57)과 같음 (알파벳인 범위)
//                result.append(c);
//            }
//        }
//        // 2. 0이 가장 앞에 있을 경우 삭제 (while로 처리해서 연달아 있는 경우 대비)
//        while (result.charAt(0) == '0') { // 자바에서는 같은 타입끼리만 비교할 수 있으므로 "0"이 아닌 '0'이라고 적어야 함
//            result.deleteCharAt(0);
//        }
//        return new String(result);
//    }

    // 강의 풀이
    public static int solution(String str) {
        int answer = 0;
        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57) { // 문자가 숫자('0'~'9') 범위인지 확인
                answer = answer * 10 + c - 48; // int와 char를 연산하면 int로 자동형변환
                // 기존 숫자를 10배 키운 후 현재 숫자를 더함 (자릿수 고려하기 위해서)
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
