import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main2_8 {
    public static ArrayList<Integer> solution(int N, ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>();

        // 크기 순으로 정렬한 배열 sortedArr 생성
        ArrayList<Integer> sortedArr = new ArrayList<>(arr);
        Collections.sort(sortedArr, Collections.reverseOrder());

        // arr 원소가 sortedArr에서 부여받은 인덱스 값 받아와서 +1 하기
        for ( int a : arr) {
            result.add(sortedArr.indexOf(a) + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(input.nextInt());
        }
        for (int num : solution(N, arr)) {
            System.out.print(num + " ");
        }
    }
}
