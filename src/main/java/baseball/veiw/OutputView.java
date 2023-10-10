package baseball.veiw;

import static baseball.constant.Constant.*;

public class OutputView {



    public void printStartMessage(){
        System.out.println(START_MESSAGE);
    }
    public void printResult(int strikeCount , int ballCount){
        if(ballCount == 0 && strikeCount == 0) {
            printNothing();
            return;
        } else if (ballCount == 0) {
            printOnlyBall(ballCount);
            return;
        } else if (strikeCount == 0) {
            printOnlyStrike(strikeCount);
            return;
        }
        printStrikeAndBall(strikeCount,ballCount);
    }
    private void printOnlyStrike(int strikeCount){
        System.out.println(String.format(STRIKE_MESSAGE,strikeCount));
    }
    private void printOnlyBall(int ballCount){
        System.out.println(String.format(BALL_MESSAGE,ballCount));
    }
    private void printStrikeAndBall(int strikeCount, int ballCount){
        System.out.println(String.format(BALL_MESSAGE+STRIKE_MESSAGE,ballCount,strikeCount));
    }
    private void printNothing(){
        System.out.println("낫싱");
    }
}
