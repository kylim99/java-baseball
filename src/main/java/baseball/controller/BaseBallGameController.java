package baseball.controller;

import baseball.domain.User;
import baseball.veiw.InputView;
import baseball.veiw.OutputView;

public class BaseBallGameController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();
    private final User user = new User();
    private final boolean endSign = false;

    public void start(){
        outputView.printStartMessage();
        run();
    }

    public void run(){
        do{
            user.createList(inputView.readNumber());

        }while (endSign);



    }
}
