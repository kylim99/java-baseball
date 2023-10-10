package baseball.controller;

import baseball.veiw.OutputView;

public class BaseBallGameController {

    private final OutputView outputView = new OutputView();

    public void start(){
        outputView.printStartMessage();
    }
}
