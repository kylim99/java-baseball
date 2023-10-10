package baseball.veiw;

import camp.nextstep.edu.missionutils.Console;

import static baseball.constant.Constant.INPUT_MESSAGE;

public class InputView {
    public String readNumber() {
        System.out.print(INPUT_MESSAGE);
        return Console.readLine();
    }
}
