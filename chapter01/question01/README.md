## 1. 문자 찾기

---

1. 설명
- 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
- 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.

2. 입력
- 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
- 문자열은 영어 알파벳으로만 구성되어 있습니다.

3. 출력
- 첫 줄에 해당 문자의 개수를 출력한다.

4. 예시 입력 1
```bash
Computercooler
c
```
5. 예시 출력 1
```bash
2
```

6. 풀이 하며 배운 점
- `static`이 없으면 `Main1_1 main = new Main1_1();`으로 객체를 생성한 후 `main.solution(a, b)`로 불러와야 하므로 주의!
- `String` 타입에서는 `<문자열>.toLowerCase();` 로 소문자 변경이 가능함
- `char` 타입에서는 별도로 `Character.toLowerCase(<문자>);`를 사용해야 함!
- `String` 타입에서는 `scanner.nextLine()` 으로 한 줄에 있는 모든 문자열 가져오기가 가능함
- `char` 타입에서는 별도로 `scanner.nextLine().charAt(0)`을 사용해야 함!
- `toCharArray`: 문자열(`String`)을 `char[](<문자 배열>)`로 변환하는 메서드