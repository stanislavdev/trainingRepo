package Task3.view;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by dvsta on 09.11.2017.
 */
public class View {

    // Resource Bundle data
    public static final String NAME_INPUT_DATA = "input.name.data";
    public static final String SURNAME_INPUT_DATA = "input.surname.data";
    public static final String NICKNAME_INPUT_DATA = "input.nickName.data";
    public static final String PHON_NUMBER_INPUT_DATA = "input.phoneNumber.data";
    public static final String SKYPE_INPUT_DATA = "input.skype.data";
    public static final String EMAIL_INPUT_DATA = "input.email.data";
    public static final String WRONG_INPUT_DATA = "input.wrong.data";

    // Resource Bundle Installation's
    static final String MESSAGES_BUNDLE_NAME = "message";
    static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
//                    new Locale("ru"));  // Russian
                    new Locale("en"));        // English

    /**
     * Method for printing message
     *
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Method for getting message from Resource Boundle
     *
     * @param message
     * @return
     */
    public String getMessageFromResourceBoundle(String message) {
        return bundle.getString(message);
    }

    /**
     * Method for concat strings
     *
     * @param message
     * @return
     */
    public String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

}