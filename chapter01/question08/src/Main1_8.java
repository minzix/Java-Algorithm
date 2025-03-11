import java.util.Scanner;

public class Main1_8 {
//    public static String solution(String str) {
//        str = str.toLowerCase(); // 소문자로 통일하기
//        char[] chars = str.toCharArray(); // 문자열 -> 문자 배열으로 변환
//        int left = 0, right = str.length() - 1;
//        while (left < right) {
//            if (!Character.isLetter(chars[left])) {
//                left++;
//                continue;
//            }
//
//            if (!Character.isLetter(chars[right])) {
//                right--;
//                continue;
//            }
//            if (chars[left] != chars[right]) {
//                return "NO";
//            }
//            left++;
//            right--;
//        }
//        return "YES";
//    }

    // 강의 풀이
    public static String solution(String str) {
        str = str.toLowerCase().replaceAll("[^a-z]", ""); // 정규표현식
        String reverseStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reverseStr)) {
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
