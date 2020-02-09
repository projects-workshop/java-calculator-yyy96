# java-calculator
문자열 계산기 미션 저장소

## 구현할 기능 목록
- [x] 문자열 입력을 받는 기능
- [x] 공백을 기준으로 문자열을 split하는 기능
- [x] 문자열 배열의 원소 개수가 홀수인지 검증하는 기능
- [x] 문자열 배열을 일급 컬렉션 Source로 저장
    - 인덱스가 홀수일 때, 숫자인지 검증하고 operands 리스트에 추가
    - 인덱스가 짝수일 때, 사칙연산기호인지 검증하고 operators 리스트에 추가
- [x] 위의 세가지를 검증 후 예외인 경우 처리하는 기능
    - 예외가 발생할 경우, 입력을 다시 받음
- [x] 순차적으로 피연산자 2개와 연산자 1개를 고르는 기능 
- [x] 피연산자 2개와 연산자 1개를 인자로 받아서 계산하는 기능
- [x] 계산한 결과를 출력하는 기능