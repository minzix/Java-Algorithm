import java.util.ArrayList;
import java.util.Scanner;

public class Main1_4 {
//    public static String[] solution (int num, String[] words) {
//        String[] answer = new String[num];
//        for (int i = 0; i < num; i++) { // words 배열 순회
//            String word = words[i];
//            int index = word.length();
//            String newWord = "";
//            for (int j = index - 1; j >= 0; j--) {
//                newWord += word.charAt(j);
//            }
//            answer[i] = newWord;
//        }
//        return answer;
//    }

    // 강의 풀이: ArrayList<String> 타입 사용
    public static ArrayList<String> solution (int num, String[] words) {
        ArrayList<String> answer = new ArrayList<>();
        for (String word : words) {
            String temp = new StringBuilder(word).reverse().toString();
            answer.add(temp);
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

        for (String result : solution(num, words)) {
            System.out.println(result);
        }

    }
}
