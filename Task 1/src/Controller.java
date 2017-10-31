import java.util.Scanner;

/**
 * Created by dvsta on 29.10.2017.
 */
public class Controller {

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setFirstValue(inputStringHelloWithScanner(sc));
        model.setSecondValue(inputStringWorldWithScanner(sc));
        model.createFullSentence();
        view.printMessageAndString(view.OUR_OUTPUT, model.getFullSentence());
    }

    // The Utility methods
    public String inputStringHelloWithScanner(Scanner sc) {
        //String for checking input "Hello"
        String helloInputValue = null;
        view.printMessage(view.INPUT_FIRST_DATA);
        while (sc.hasNextLine()) {
            helloInputValue = sc.nextLine();
            if (!model.isHello(helloInputValue)) {
                view.printMessage(View.WRONG_FIRST_INPUT);
            } else {
                break;
            }
        }
        return helloInputValue;
    }

    public String inputStringWorldWithScanner(Scanner sc) {
        //String for checking input "Hello"
        String worldInputValue = null;
        view.printMessage(view.INPUT_SECOND_DATA);
        while (sc.hasNextLine()) {
           worldInputValue = sc.nextLine();
            if (!model.isWorld(worldInputValue)) {
                view.printMessage(View.WRONG_SECOND_INPUT);
            } else {
                break;
            }
        }
        return worldInputValue;
    }
}

