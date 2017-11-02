package Task2;

import java.util.ArrayList;

/**
 * Created by dvsta on 02.11.2017.
 */
public class View {
    public static final String INPUT_DATA_IS_GREATER = "Your number is too large: ";
    public static final String INPUT_DATA_IS_SMALLER = "Your number is too small: ";
    public static final String INPUT_NUMBER = "Input your number: ";
    public static final String WRONG_INPUT = "Wrong input data! Please repeat: ";
    public static final String SUCCESS = "It's right number!";
    public static final String RANGE = "The range of random number: ";
    public static final String PREVIOUS_RESULT = "Your previous result: ";

    public void printHistory(ArrayList<Integer> arrayList) {
        for (Integer i : arrayList) {
            System.out.println("History: " + i);
        }
    }

    public void printMessageAndValue(String message, int value){
        System.out.println(message + value);
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}
