/**
 * Created by dvsta on 29.10.2017.
 */
public class View {
    // Text's constants
    public static final String INPUT_FIRST_DATA = "Input \"Hello\" : ";
    public static final String INPUT_SECOND_DATA = "Input \"world!\" : ";
    public static final String WRONG_FIRST_INPUT = "Wrong input word \"Hello\"! Repeat please! ";
    public static final String WRONG_SECOND_INPUT = "Wrong input word \"world!\"! Repeat please! ";
    public static final String OUR_OUTPUT = "Full sentence: ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndString(String message, String value){
        System.out.println(message + value);
    }
}
