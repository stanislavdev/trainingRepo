package Task2;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by dvsta on 02.11.2017.
 */
public class View {
    // Resource Bundle Installation's
    public static final String MESSAGES_BUNDLE_NAME = "messages_ru";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ru"));  // Ukrainian
//                    new Locale("en"));        // English

    // Text's constants
    public static final String SPACE_SING = " ";
    public static final String COLON_SING = ":";
    public static final String OPENS_SQUARE_BRACKET = "[";
    public static final String CLOSING_SQUARE_BRACKET = "]";

    public static final String INPUT_INT_DATA = "input.int.data";
    public static final String WRONG_RANGE_DATA = "input.wrong.range";
    public static final String WRONG_INPUT_DATA = "input.wrong.data";
    public static final String SUCCESS = "input.success";
    public static final String HISTORY = "input.history";
    public static final String INPUT_DATA_IS_GREATER = "input.number.greater";
    public static final String INPUT_DATA_IS_SMALLER = "input.number.smaller";
    public static final String INPUT_RANGE = "input.number.range";

    /**
     * Method for printing message
     *
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Method for concat strings
     *
     * @param message
     * @return
     */
    public String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    String getInputMessage() {
        return concatenationString(bundle.getString(INPUT_INT_DATA), COLON_SING);
    }

    String getRangeMessage(int minBarrier, int maxBarrier) {
        String str = concatenationString(bundle.getString(INPUT_RANGE),
                COLON_SING, OPENS_SQUARE_BRACKET, String.valueOf(minBarrier),
                SPACE_SING, String.valueOf(maxBarrier), CLOSING_SQUARE_BRACKET);
        return str;
    }

    void printWrongRangeInput(Model model) {
        printMessage(getRangeMessage(model.getMinBorderForRandomNumber(),
                model.getMaxBorderForRandomNumber()));
        printMessage(concatenationString(bundle.getString(WRONG_RANGE_DATA),
                SPACE_SING, getInputMessage()));
    }

    void printWrongIntInput(Model model) {
        printMessage(getRangeMessage(model.getMinBorderForRandomNumber(),
                model.getMaxBorderForRandomNumber()));
        printMessage(concatenationString(bundle.getString(WRONG_INPUT_DATA),
                SPACE_SING, getInputMessage()));
    }

    void printSuccessInput(Model model) {
        printMessage(concatenationString(bundle.getString(SUCCESS),
                SPACE_SING, COLON_SING, SPACE_SING, String.valueOf(model.getRandomNumber())));
    }

    void printGreaterNumber() {
        printMessage(bundle.getString(INPUT_DATA_IS_GREATER));
    }

    void printSmallerNumber() {
        printMessage(bundle.getString(INPUT_DATA_IS_SMALLER));
    }

    void printHistory(Model model) {
        printMessage(concatenationString(bundle.getString(HISTORY),
                COLON_SING, String.valueOf(model.getHistoryOfPlayerAttempts())));
    }
}
