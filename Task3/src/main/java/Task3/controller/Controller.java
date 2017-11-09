package Task3.controller;

import Task3.model.Model;
import Task3.view.TextConstant;
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
        ResourceBundle resourceBundle = ResourceBundle.getBundle("regex", new Locale("en"));
        utilityController = new UtilityController(scanner, view);
        model.setName(utilityController.inputStringValueWithScanner(
                View.NAME_INPUT_DATA, resourceBundle.getString("name")));
        model.setSurname(utilityController.inputStringValueWithScanner(
                View.SURNAME_INPUT_DATA, resourceBundle.getString("surname")));
        model.setNickName(utilityController.inputStringValueWithScanner(
                View.NICKNAME_INPUT_DATA, resourceBundle.getString("nickName")));
        model.setPhoneNumber(utilityController.inputStringValueWithScanner(
                View.PHON_NUMBER_INPUT_DATA, resourceBundle.getString("phoneNumber")));
        model.setSkype(utilityController.inputStringValueWithScanner(
                View.SKYPE_INPUT_DATA, resourceBundle.getString("skype")));
        model.setEmail(utilityController.inputStringValueWithScanner(
                View.EMAIL_INPUT_DATA, resourceBundle.getString("email")));

        view.printMessage(view.concatenationString(
                model.getName(), TextConstant.SPACE_SING,
                model.getSurname(), TextConstant.SPACE_SING,
                model.getNickName(), TextConstant.SPACE_SING,
                model.getPhoneNumber(), TextConstant.SPACE_SING,
                model.getSkype(), TextConstant.SPACE_SING, model.getEmail()
        ));
    }
}
