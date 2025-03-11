import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1_10 {
//    // 내 풀이: 이중 for 문 사용..
//    public static StringBuilder solution(String str, char ch) {
//        StringBuilder result = new StringBuilder(); // 결과값
//        List<Integer> indexList = new ArrayList<>(); // 문자 t에 해당하는 인덱스
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ch) {
//                indexList.add(i);
//            }
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//            int min = str.length() - 1;
//            for (int j = 0; j < indexList.size(); j++) {
//                int temp = Math.abs(i - indexList.get(j));
//                if (temp < min) {
//                    min = temp;
//                }
//            }
//            result.append(min).append(" "); // 숫자 뒤에 공백 추가
//
//        }
//        return result;
//    }
    // 강의 풀이
    public static int[] solution(String str, char ch) {
        int[] answer = new int[str.length()];
        // 왼쪽부터 돌면서 각 문자 기준 왼쪽에 있는 ch에 대해 떨어진 거리 출력
        int max = 10000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                max = 0;
                answer[i] = max;
            } else {
                max++;
                answer[i] = max;
            }
        }
        // 오른쪽부터 돌면서 각 문자 기준 오른쪽에 있는 ch에 대해 떨어진 거리 출력
        max = 10000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ch) {
                max = 0;
//                answer[i] = max; // 이미 앞에서 넣었을 테니까 넣진 않아도 됨
            } else {
                max++;
                answer[i] = Math.min(max, answer[i]);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char ch = scanner.next().charAt(0);
        // System.out.println(solution(str, ch));
        for (int c : solution(str, ch)) {
            System.out.print(c + " ");
        }
    }
}
