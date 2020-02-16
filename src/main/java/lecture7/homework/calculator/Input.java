package lecture7.homework.calculator;

import lecture7.homework.JsonPrint;

public class Input {

    private final long firstNum;
    private final long SecondNum;

    private final String result;


    public Input(long firstNum, long SecondNum, String result) {
        this.firstNum = firstNum;
        this.SecondNum = SecondNum;
        this.result = result;
    }

    public long getFirstNum() {
        return firstNum;
    }
    public long getSecondNum() {
        return SecondNum;
    }
    public String getResult() {
        return result;
    }

}