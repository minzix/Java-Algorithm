import java.util.Scanner;

public class Main1_7 {
//    // 내 풀이
//    public static String solution(String str) {
//        str = str.toLowerCase(); // 소문자로 통일하기
//        char[] chars = str.toCharArray(); // 문자열 -> 문자 배열으로 변환
//        int left = 0, right = str.length() - 1;
//        while (left < right) {
//            if (chars[left] != chars[right]) {
//                return "NO";
//            }
//            left++;
//            right--;
//        }
//        return "YES";
//    }
//    // 강의 풀이 1: i번째랑 length-1-i번째랑 비교해나가기
//    public static String solution(String str) {
//        int length = str.length(); // 문자열의 문자가 짝수개 있던 홀수개 있던간에 길이/2 번만 검사하면 됨
//        str = str.toLowerCase(); // 소문자로 통일하기
//        for (int i = 0; i < length / 2; i++) {
//            if (str.charAt(i) != str.charAt(length-i-1)) {
//                return "NO";
//            }
//        }
//        return "YES";
//    }
    // 강의 풀이 2: StringBuilder는 문자열을 역으로 뒤집는 기능을 제공함
    public static String solution(String str) {
        // str = str.toLowerCase();
        String reverseString = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reverseString)) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }
}
