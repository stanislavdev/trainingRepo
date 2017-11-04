package Task2;


import java.util.Scanner;

/**
 * Created by dvsta on 02.11.2017.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Method fot user data input
     *
     * @param scanner console input data
     * @return user input data or massage about wrong input
     */
    public int userInputData(Scanner scanner) {
        int inputUserNumberFromConsole;
        while (true) {
            if (scanner.hasNextInt()) {
                inputUserNumberFromConsole = scanner.nextInt();
                if (model.isNumberCorrect(inputUserNumberFromConsole)) {
                    break;
                } else {
                    view.printWrongRangeInput(model);
                }
            } else {
                view.printWrongIntInput(model);
                scanner.next();
            }
        }
        return inputUserNumberFromConsole;
    }

    /**
     * Start Java game
     */
    public void run() {
        Scanner scanner = new Scanner(System.in);
        model.setBorderMeasures(GlobalConstants.PRIMARY_MIN_BORDER,
                GlobalConstants.PRIMARY_MAX_BORDER);

        view.printMessage(view.getRangeMessage(model.getMinBorderForRandomNumber(),
                model.getMaxBorderForRandomNumber()));
        view.printMessage(view.getInputMessage());

        model.setRandomNumber();
        while (true) {
            int result = model.compareUserGuess(userInputData(scanner));
            if (result == 1) {
                view.printGreaterNumber();
                view.printMessage(view.getRangeMessage(model.getMinBorderForRandomNumber(),
                        model.getMaxBorderForRandomNumber()));
            }
            if (result == -1) {
                view.printSmallerNumber();
                view.printMessage(view.getRangeMessage(model.getMinBorderForRandomNumber(),
                        model.getMaxBorderForRandomNumber()));
            }
            if (result == 0) {
                view.printSuccessInput(model);
                view.printHistory(model);
                break;
            }
        }
    }
}
