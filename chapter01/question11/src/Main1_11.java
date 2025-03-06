import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

// Map으로 시도 -> 연속으로 반복되는 문자끼리만 압축할 수 있음
// 예를 들어, ASSSSSSSA의 경우 A1, A1을 각각 저장할 수 있어야 ASA로 압축이 가능함
// 그러나 Map은 같은 키가 여러개 중복해서 존재할 수 없음

// 배열로 시도해서 char[] 알파벳배열, int[] 숫자배열 이케 만들고
// if (chars[i] == chars[i+1]) 숫자배열만 증가
// else 숫자배열에 1 추가, 알파벳배열에 char[i] 추가
// 이런 방향으로 가고 싶었는데 문제는 두 배열 사이를 mapping하는게 어려울 거 같음

public class Main1_11 {
    public static StringBuilder solution(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>(); // LinkedHashMap : 삽입 순서를 유지함
        StringBuilder result = new StringBuilder();

//        for (int i = 0; i < chars.length; i++) {
//            if (map.containsKey(chars[i])) {
//                map.put(chars[i], map.get(chars[i]) + 1);
//            } else {
//                map.put(chars[i], 1);
//            }
//        }
        for (int i = 0; i < chars.length; i++) {
            Map.Entry<Character, Integer> lastEntry = null;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                lastEntry = entry; // 마지막 엔트리 저장
            }
            if (lastEntry.getKey() == chars[i]) {
                map.put(chars[i], map.get(chars[i]) + 1);
            } else {
                map.put(chars[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result.append(entry.getKey());
            if (entry.getValue() != 1) {
                result.append(entry.getValue());
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }
}
