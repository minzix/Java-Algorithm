import java.util.Scanner;

public class Main4 {
    public static String[] solution (int num, String[] words) {
        String[] answer = new String[num];
        for (int i = 0; i < num; i++) { // words 배열 순회
            String word = words[i];
            int index = word.length();
            String newWord = "";
            for (int j = index - 1; j >= 0; j--) {
                newWord += word.charAt(j);
            }
            answer[i] = newWord;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // 숫자만 읽고 개행 문자(\n)를 버퍼에 남김.
        scanner.nextLine();
        String[] words = new String[num];
        for (int i = 0; i < num; i++) {
            words[i] = scanner.nextLine();
        }

        String[] results = solution(num, words);
        for (String result : results) {
            System.out.println(result);
        }

    }
}
