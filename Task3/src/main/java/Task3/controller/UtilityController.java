package Task3.controller;

import Task3.model.Model;
import Task3.model.NotUniqueLoginException;
import Task3.model.Record;
import Task3.view.TextConstant;
import Task3.view.View;

import java.util.ResourceBundle;
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

    void addRecordToNoteBookFromConsole(Model model, ResourceBundle resourceBundle) {
        model.getNoteBook().addRecord(new Record(
                /*inputStringValueWithScanner(View.NAME_INPUT_DATA, resourceBundle.getString("name")),
                inputStringValueWithScanner(View.SURNAME_INPUT_DATA, resourceBundle.getString("surname")),*/
                inputStringValueWithScanner(View.NICKNAME_INPUT_DATA, resourceBundle.getString("nickName"))/*,
                inputStringValueWithScanner(View.PHON_NUMBER_INPUT_DATA, resourceBundle.getString("phoneNumber")),
                inputStringValueWithScanner(View.SKYPE_INPUT_DATA, resourceBundle.getString("skype")),
                inputStringValueWithScanner(View.EMAIL_INPUT_DATA, resourceBundle.getString("email"))*/
        ));
    }
}
