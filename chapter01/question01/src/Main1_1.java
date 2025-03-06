import java.util.Scanner;

public class Main1_1 {
    public static int solution(String input, char character) {
        // 대소문자 구분 없이 실행하기
        input = input.toLowerCase();
        character = Character.toLowerCase(character);

        // 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 세는 용도의 변수
        int count = 0;
        for (char c : input.toCharArray()) { // 문자열 -> 문자 배열로 변환 후 반복문으로 순회
            if (c == character) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        // 입력 받기
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char character = scanner.nextLine().charAt(0);

        // solution 함수 호출해서 답 출력
        System.out.println(solution(input, character));
        scanner.close();
    }
}