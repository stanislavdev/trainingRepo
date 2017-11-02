package Task2;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dvsta on 02.11.2017.
 */

/**
 * Model
 */
public class Model {
    private int min;
    private int max;
    private int randomNumber;

    private static final int RAND_MAX = 65536;

    private ArrayList<Integer> history;

    public Model(){
        history = new ArrayList<Integer>();
        setMin(0);
        setMax(100);
        setRandomNumber(rand(getMin(), getMax()));
    }

    /**
     * Function rand without parameters.
     *
     * @return random integer between 0 and RAND_MAX.
     */
    public int rand() {
        Random random = new Random();
        return random.nextInt(RAND_MAX + 1);
    }

    /**
     * Function rand with parameters.
     *
     * @return random integer between min and max.
     */
    public int rand(int min, int max) {
        if (max < min) {
            System.out.println("Wrong measure of max and min");
            return -1;
        } else {
            Random random = new Random();
            return min + random.nextInt(max - min + 1);
        }
    }

    /**
     * Checking user number.
     *
     * @return true if number is correct, false if not.
     */
    public boolean checkNumber(int guessedNumber) {
        return guessedNumber <= max && guessedNumber >= min;
    }

    /**
     * Cheching user guess.
     *
     * @param userNumber is user number.
     * @return 1 if user number is greater, -1 if lower and 0 if user number is equal to programme number.
     */
    public int checkUserGuess(int userNumber) {

        history.add(userNumber);

        if (userNumber > randomNumber) {
            min = userNumber + 1;
            return 1;
        }
        if (userNumber < randomNumber) {
            max = userNumber - 1;
            return -1;
        } else
            return 0;
    }

    public ArrayList<Integer> getHistory(){
        return history;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public static int getRandMax() {
        return RAND_MAX;
    }
}
