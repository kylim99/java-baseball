package baseball.validation;

import baseball.veiw.InputView;

import java.util.List;

import static baseball.constant.Constant.ERROR_MESSAGE;
import static baseball.constant.Constant.LIST_LENGTH;

public class Validation {
    public boolean isValidListLength(List<Integer> list){

        return list.size() != LIST_LENGTH;
    }

    public void validationManager(List<Integer> numberList) {
        if(isValidListLength(numberList)){
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
    }
}
