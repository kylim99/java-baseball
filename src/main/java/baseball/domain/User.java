package baseball.domain;



import java.util.ArrayList;
import java.util.List;

import static baseball.constant.Constant.ERROR_MESSAGE;

public class User {
    private final List<Integer> numberList = new ArrayList<>();

    public void createList(String numbers){
        for(int i = 0 ; i < numbers.length(); i++){
            numberList.add(charToInt(numbers.charAt(i)));
        }
    }
    public int charToInt(char number){
        return parseInt(number);
    }
    public int parseInt(char number){
        try{
            return Character.getNumericValue(number);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
    }
    public List<Integer> getNumberList(){
        return this.numberList;
    }
}
