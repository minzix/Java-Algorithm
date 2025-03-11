import java.util.Scanner;

public class Main1_11 {
    public static String solution(String str) {
        String answer = "";
        // i가 맨 마지막일 때 i+1이랑 비교하려고 하면 outofbound 오류가 발생하게 될 것임
        // -> 문자열 순회하기 전에 맨 끝에 빈 문자 하나 붙이기 (+" ")
        str = str + " ";
        int count = 1;
        // i와 i+1번째 문자를 계속해서 비교함
        for (int i = 0; i < str.length() - 1; i++) { // str.length() - 1로 수정해서 i가 빈문자열이 되지 않도록 하기
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++; // 같을 때: count++를 해주고 넘어감

            } else {
                answer += str.charAt(i); // 다를 때: (1) 무조건 i에 해당하는 알파벳을 answer에 더해주기
                if (count > 1) {
                    answer += count; // 만약 count > 1일 경우 answer에 count도 더하기
                    count = 1; // 한번 더해주고 나면 count는 초기화해야 함
                }
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
