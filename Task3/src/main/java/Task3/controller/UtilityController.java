package Task3.controller;

import Task3.view.TextConstant;
import Task3.view.View;

import java.util.Scanner;

/**
 * Created by dvsta on 09.11.2017.
 */
public class UtilityController {
    Scanner scanner;
    View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    /**
     * Method fot user data input
     *
     * @param message
     * @param regex
     * @return user input data or massage about wrong input
     */
    String inputStringValueWithScanner(String message, String regex) {
        String result;
        view.printMessage(view.concatenationString(view.getMessageFromResourceBoundle(message),
                TextConstant.COLON_SING));
        while (!(scanner.hasNext() && (result = scanner.next()).matches(regex))) {
            view.printMessage(view.getMessageFromResourceBoundle(View.WRONG_INPUT_DATA));
        }
        return result;
    }
}
