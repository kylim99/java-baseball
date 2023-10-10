package baseball.controller;

import baseball.domain.User;
import baseball.validation.Validation;
import baseball.veiw.InputView;
import baseball.veiw.OutputView;

import java.util.List;

public class BaseBallGameController {

    private final Validation validation = new Validation();
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
            isValid(user.getNumberList());


        }while (endSign);



    }
    public void isValid(List<Integer> list){
        validation.validationManager(list);
    }
}
