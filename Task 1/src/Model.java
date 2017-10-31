import java.util.Scanner;

/**
 * Created by dvsta on 29.10.2017.
 */
public class Model {
    private String firstValue;
    private String secondValue;
    private String fullSentence;

    // The Program logic

    /**
     * in this method create sentence using
     * this.firstValue and this.secondValue
     *
     * @return sentence
     */
    public void createFullSentence() {
        fullSentence = firstValue + " " + secondValue;
    }

    public boolean isHello(String inputValue) {
        if (inputValue.equals("Hello"))
            return true;
        else {
            return false;
        }
    }

    public boolean isWorld(String inputValue) {
        if (inputValue.equals("world!"))
            return true;
        else {
            return false;
        }
    }

    public String getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(String firstValue) {
        this.firstValue = firstValue;
    }

    public String getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(String secondValue) {
        this.secondValue = secondValue;
    }

    public String getFullSentence() {
        return fullSentence;
    }

    public void setFullSentence(String fullSentence) {
        this.fullSentence = fullSentence;
    }
}
