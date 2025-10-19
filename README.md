# java-calculator-precourse

> 우테코 8기 BE 프리코스 1주차 미션: 문자열 덧셈 계산기

## Sequence Diagram

![java-calculator-8 SD.png](images%2Fjava-calculator-8%20SD.png)

## Classes

- `Calculator`: 계산기 메인 로직
- `UserView`: Application에서 사용자에게 text를 보여 주는 클래스
- `InputManager`: 사용자에게 데이터를 받아오는 클래스
- `InputValidator`: 입력 데이터를 검증하는 클래스
- `InputParser`: 문자열로 된 입력 데이터를 여러 개의 숫자의 `Array`로 반환
- `Seperator`: Delimiter에 따라 문자열을 여러 개의 숫자의 `Array`로 반환
- `CalculateResult`: 계산 결과 데이터 Domain
- `CalculatorService`: 계산기에서 실제로 계산하는 로직을 가지는 클래스
- `CalculatorController`: 계산할 데이터를 받아와 `CalculatorService`에 전달

![java-calculator-8 SD.png](images%2Fjava-calculator-8%20SD.png)

## ✅ 구현할 기능 목록

- `Calculator`
    - [X] 사용자에게 데이터를 받아오는 기능(`InputManager`에게 요청하기)
    - [X] 문자열 데이터를 숫자의 `Array`로 변환하는 기능(`InputParser`에게 요청하기)
    - [X] 숫자 `Array`를 계산하는 기능(`CalculatorController`에게 요청하기)
    - [X] 계산 결과를 출력하는 기능(`UserView`에게 요청하기)
- `UserView`
    - [X] 입력을 요구하는 텍스트를 콘솔에 출력
    - [X] 계산 결과를 받아 콘솔에 출력
- `InputManager`
    - [X] 사용자에게 문자열 데이터를 입력받는 기능
    - [X] 입력받은 데이터를 `InputValidator`에 넘겨서 검증
    - [X] 검증 결과를 받고 예외 처리
    - [X] 입력받은 데이터를 반환하는 기능
- `InputValidator`
    - [X] 문자열을 받아 유효한 데이터인지 검증
    - [X] 아래의 경우 잘못된 값으로 취급
        - 숫자가 delimiter로 설정된 경우
        - delimiter 문법이 잘못된 경우(//가 있는데 개행이 없는 경우)
        - delimiter로 설정된 문자 외의 것이 문자열에 있는 경우
    - [X] 그 결과를 `Boolean`으로 반환
- `InputParser`
    - [X] 문자열 데이터의 Delimiter를 확인
    - [X] Delimiter와 계산해야 할 데이터를 `Seperator`에게 전달하고,
    - [X] 그 결과를 반환
- `Seperator`
    - [X] Delimiter와 seperate할 문자열을 받아와 여러 개의 숫자의 `Array`로 반환
- `CalculatorController`
    - [X] `Array` 받아서 `CalculatorService`에 전달하고 결과를 반환
- `CalculatorService`
    - [X] `Array` 받아서 모든 데이터의 합을 반환

## Commit Conventions

- [Commit Message Conventions](https://gist.github.com/stephenparish/9941e89d80e2bc58a153)
- 위 링크를 기반으로 설정하였음

  ```
  <type>(<scope>): <subject>
    
  상세 변경 내역
    
  중요한 변경점(Breaking change)
  ```

- `<type>`: feat, fix, docs, refactor, …
- `<scope>`: 어떤 모듈/컴포넌트/기능이 변경되었는지
- `<subject>`: 변경사항 요약, 현재 시제로 기록(added X), 마침표 생략
- 상세 변경 내역: 추가 설명 or 구체적인 변경 목록