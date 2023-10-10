package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static baseball.constant.Constant.*;

public class Computer {
    private List<Integer> answerList = new ArrayList<>();

    public void creatAnswerList(){
        while (answerList.size() < LIST_LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
            if (!answerList.contains(randomNumber)) {
                answerList.add(randomNumber);
            }
        }
    }
}
