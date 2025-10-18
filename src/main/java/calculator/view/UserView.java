package calculator.view;

public class UserView {
    public void showInputMessage() {
        System.out.println("합계를 구할 숫자를 입력하세요.");
    }

    public void showResult(int result) {
        System.out.println("결과 : " + result);
    }
}
