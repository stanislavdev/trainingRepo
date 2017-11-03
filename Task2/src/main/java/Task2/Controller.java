package Task2;


import java.util.Scanner;

/**
 * Created by dvsta on 02.11.2017.
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Function fot user data input.
     *
     * @param scanner console input data.
     * @return user input data or massage about wrong input.
     */
    public int userInputData(Scanner scanner) {
        int inputUserNumberFromConsole;
        while (true) {
            view.printMessage(View.INPUT_NUMBER);
            if (scanner.hasNextInt()) {
                inputUserNumberFromConsole = scanner.nextInt();
                if (model.checkNumber(inputUserNumberFromConsole)) {
                    break;
                }
                else {
                    view.printMessage(View.WRONG_INPUT);
                }
            } else {
                view.printMessage(View.WRONG_INPUT);
                scanner.next();
            }
        }
        return inputUserNumberFromConsole;
    }

    /**
     * Start Java game
     */
    public void run(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            int result = model.checkUserGuess(userInputData(scanner));
            if (result == 1 ){
                view.printMessage(View.INPUT_DATA_IS_GREATER);
                view.printPreviousHistory(model.getHistory());
                view.printMessageAndRange(View.RANGE, model.getMin(), model.getMax());
            }
            if (result == -1){
                view.printMessage(View.INPUT_DATA_IS_SMALLER);
                view.printPreviousHistory(model.getHistory());
                view.printMessageAndRange(View.RANGE, model.getMin(), model.getMax());
            }
            if (result == 0){
                view.printMessage(View.SUCCESS);
                view.printHistory(model.getHistory());
                break;
            }
        }
    }
}
