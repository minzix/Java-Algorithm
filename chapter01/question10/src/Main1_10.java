import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1_10 {
    public static StringBuilder solution(String str, char ch) {
        StringBuilder result = new StringBuilder(); // 결과값
        List<Integer> indexList = new ArrayList<>(); // 문자 t에 해당하는 인덱스
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                indexList.add(i);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            int min = str.length() - 1;
            for (int j = 0; j < indexList.size(); j++) {
                int temp = Math.abs(i - indexList.get(j));
                if (temp < min) {
                    min = temp;
                }
            }
            result.append(min).append(" "); // 숫자 뒤에 공백 추가

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char ch = scanner.next().charAt(0);
        System.out.println(solution(str, ch));
    }
}
