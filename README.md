# java-calculator-precourse

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

## ✅ 구현할 기능 목록

- `Calculator`
  - [ ] 사용자에게 데이터를 받아오는 기능(`InputManager`에게 요청하기)
  - [ ] 문자열 데이터를 숫자의 `Array`로 변환하는 기능(`InputParser`에게 요청하기)
  - [ ] 숫자 `Array`를 계산하는 기능(`CalculatorController`에게 요청하기)
  - [ ] 계산 결과를 출력하는 기능(`UserView`에게 요청하기)
- `UserView`
  - [ ] 입력을 요구하는 텍스트를 콘솔에 출력
  - [ ] 계산 결과를 받아 콘솔에 출력
- `InputManager`
  - [ ] 사용자에게 문자열 데이터를 입력받는 기능
  - [ ] 입력받은 데이터를 `InputValidator`에 넘겨서 검증
  - [ ] 검증 결과를 받고 예외 처리
  - [ ] 입력받은 데이터를 반환하는 기능
- `InputValidator`
  - [ ] 문자열을 받아 유효한 데이터인지 검증
  - [ ] 그 결과를 `Boolean`으로 반환
- `InputParser`
  - [ ] 문자열 데이터의 Delimiter를 확인
  - [ ] Delimiter와 계산해야 할 데이터를 `Seperator`에게 전달하고,
  - [ ] 그 결과를 반환
- `Seperator`
  - [ ] Delimiter와 seperate할 문자열을 받아와 여러 개의 숫자의 `Array`로 반환
- `CalculatorController`
  - [ ] `Array` 받아서 `CalculatorService`에 전달하고 결과를 반환
- `CalculatorService`
  - [ ] `Array` 받아서 모든 데이터의 합을 반환
