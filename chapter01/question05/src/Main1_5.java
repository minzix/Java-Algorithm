import java.util.Scanner;

public class Main1_5 {
    public static String solution(String str) {
        char[] arr = str.toCharArray(); // 문자열을 문자 배열로 변환
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (!Character.isLetter(arr[left])) { // 왼쪽 문자가 알파벳이 아닐 경우 건너뛰기
                left++;
            } else if (!Character.isLetter(arr[right])) {  // 오른쪽 문자가 알파벳이 아닐 경우 건너뛰기
                right--;
            } else { // 두 문자가 모두 알파벳이면 Swap
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            // 인덱스 이동
            left++;
            right--;
        }
        return new String(arr); // 문자 배열을 다시 문자열로 변환
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        System.out.println(solution(str));
    }
}
