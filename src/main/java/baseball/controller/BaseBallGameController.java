package baseball.controller;

import baseball.domain.Computer;
import baseball.domain.User;
import baseball.validation.Validation;
import baseball.veiw.InputView;
import baseball.veiw.OutputView;

import java.util.List;

import static baseball.constant.Constant.LIST_LENGTH;

public class BaseBallGameController {

    private final Validation validation = new Validation();
    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();
    private final User user = new User();
    private final Computer computer = new Computer();
    private final boolean endSign = false;

    public void start(){
        outputView.printStartMessage();
        run();
    }

    private void run(){
        do{
            initGame();
            user.createList(inputView.readNumber());
            isValid(user.getNumberList());
            computer.creatAnswerList();
            calculateResult(user.getNumberList(),computer.getAnswerList());


        }while (endSign);



    }

    private void calculateResult(List<Integer> userList,List<Integer> answerList) {
        for(int i = 0 ; i < LIST_LENGTH;i++){
            isStrike(userList.get(i),answerList.get(i));
            isBall(userList.get(i),answerList);
        }
    }

    private void isBall(int userNumber, List<Integer> answerList) {
        if(answerList.contains(userNumber)){
            user.plusBallCount();
        }
    }

    private void isStrike(int userNumber,int computerNumber){
        if(userNumber == computerNumber){
            user.plusStrikeCount();
        }
    }


    private void isValid(List<Integer> list){
        validation.validationManager(list);
    }
    private void initGame(){
        user.getNumberList().clear();
        computer.getAnswerList().clear();
    }
}
