package calculator.view;

public class UserView {
    public void showInputMessage() {
        System.out.println(UserViewConstant.INPUT_MESSAGE);
    }

    public void showResult(int result) {
        System.out.println(UserViewConstant.RESULT_MESSAGE + result);
    }
}
