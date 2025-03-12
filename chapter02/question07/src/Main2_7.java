import java.util.ArrayList;
import java.util.Scanner;

public class Main2_7 {
    public static int solution(int N, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1. 서로 인접한 1의 개수 세서 배열에 저장하기 [a개, b개, c개..]
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                temp++;
            } else {
                if (temp != 0){
                    list.add(temp);
                    temp = 0;
                }
            }
        }
        if (temp != 0) list.add(temp);  // 이 부분이 누락되었었음..

//        for (Integer i : list) {
//            System.out.println("i = " + i);
//        }
        // 2. 총 점수 = a! + b! + c!
        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j <= list.get(i); j++) {
                answer += j;
            }
//            System.out.println("answer = " + answer);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(solution(N, arr));
    }
}
