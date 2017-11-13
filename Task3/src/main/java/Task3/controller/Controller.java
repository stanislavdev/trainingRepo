package Task3.controller;

import Task3.model.Model;
import Task3.model.NotUniqueLoginException;
import Task3.view.View;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Created by dvsta on 09.11.2017.
 */
public class Controller {
    private Model model;
    private View view;
    private UtilityController utilityController;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        utilityController = new UtilityController(scanner, view);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("regex", new Locale("en"));
        while (true) {
            try {
                utilityController.addRecordToNoteBookFromConsole(model, resourceBundle);
            } catch (NotUniqueLoginException exception) {
                exception.printStackTrace();
                askAnotherLogin(exception, utilityController, resourceBundle);
            }
            view.printMessage(model.getNoteBook().getRecordArrayList().get(
                    model.getNoteBook().getRecordArrayList().size() - 1).toString());
        }
    }

    void askAnotherLogin(NotUniqueLoginException ex, UtilityController utilityController, ResourceBundle resourceBundle) {
        try {
            String inputLogin = utilityController.inputStringValueWithScanner(View.NICKNAME_INPUT_DATA,
                    resourceBundle.getString("nickName"));
            ex.getRecord().setNickName(inputLogin);
            model.getNoteBook().addRecord(ex.getRecord());
        } catch (NotUniqueLoginException exception) {
            exception.printStackTrace();
            askAnotherLogin(exception, utilityController, resourceBundle);
        }
    }
}
