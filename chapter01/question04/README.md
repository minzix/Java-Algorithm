## 4. 단어 뒤집기

1. 설명
- N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

2. 입력

- 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
- 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

3. 출력

- N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.

4. 예시 입력 1

```bash
3
good
Time
Big
```
5. 예시 출력 1
```bash
doog
emiT
giB
```

6. 배운 점
- `int num = scanner.nextInt();`로 받으면 숫자만 읽고 개행 문자(\n)를 버퍼에 남기므로, 이후에 다른 입력을 받아야 한다면 반드시 `scanner.nextLine();`을 이어서 적어줘서 개행문자를 처리해야 함

