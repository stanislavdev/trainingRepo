package Task2;

import java.util.ArrayList;

/**
 * Created by dvsta on 02.11.2017.
 */
public class View {
    public static final String INPUT_DATA_IS_GREATER = "Your number is too large! ";
    public static final String INPUT_DATA_IS_SMALLER = "Your number is too small! ";
    public static final String INPUT_NUMBER = "Input your number: ";
    public static final String WRONG_INPUT = "Wrong input data!";
    public static final String SUCCESS = "It's right number!";
    public static final String RANGE = "The range of random number: ";

    public void printHistory(ArrayList<Integer> arrayList) {
        System.out.println("History: ");
        for (Integer i : arrayList) {
            System.out.println(i);
        }
    }

    public void printPreviousHistory(ArrayList<Integer> arrayList) {
        System.out.println("Your previous tries");
        for (Integer i : arrayList) {
            System.out.print(i + " ->");
        }
    }

    public void printMessageAndValue(String message, int value) {
        System.out.println(message + value);
    }

    public void printMessageAndRange(String message, int minValue, int maxValue) {
        System.out.println("\n" + message + "[" + minValue + ";" + maxValue + "]");
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
