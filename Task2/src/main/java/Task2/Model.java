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
    /**
     * Maximum of random number
     */
    private static final int RAND_MAX = 65536;
    /**
     * Min border for random number
     */
    private int minBorderForRandomNumber;
    /**
     * Max border for random number
     */
    private int maxBorderForRandomNumber;
    /**
     * Random number which is guessed by programme
     */
    private int randomNumber;
    /**
     * Array for saving history of user tries
     */
    private ArrayList<Integer> historyOfPlayerAttempts = new ArrayList<Integer>();

    public static int getRandMax() {
        return RAND_MAX;
    }

    /**
     * Method for setting borders of random value
     *
     * @param minBorderForRandomNumber
     * @param maxBorderForRandomNumber
     */
    public void setBorderMeasures(int minBorderForRandomNumber, int maxBorderForRandomNumber) {
        if (maxBorderForRandomNumber < minBorderForRandomNumber) {
            System.out.println("Wrong measure of max and min");
        } else {
            this.minBorderForRandomNumber = minBorderForRandomNumber;
            this.maxBorderForRandomNumber = maxBorderForRandomNumber;
        }
    }

    /**
     * Method for generation rand number with parameters
     *
     * @return random integer between min and max
     */
    public void setRandomNumber() {
        Random random = new Random();
        randomNumber = minBorderForRandomNumber +
                random.nextInt(maxBorderForRandomNumber - minBorderForRandomNumber + 1);
    }

    /**
     * Checking user number which user input into console
     *
     * @return true if number is correct, false if not
     */
    public boolean isNumberCorrect(int guessedNumber) {
        return guessedNumber <= maxBorderForRandomNumber && guessedNumber >= minBorderForRandomNumber;
    }

    /**
     * Checking user guess
     *
     * @param userNumber is user number
     * @return 1 if user number is greater, -1 if lower and 0 if user number is equal to programme number
     */
    public int compareUserGuess(int userNumber) {

        historyOfPlayerAttempts.add(userNumber);

        if (userNumber > randomNumber) {
            maxBorderForRandomNumber = userNumber - 1;
            return 1;
        }
        if (userNumber < randomNumber) {
            minBorderForRandomNumber = userNumber + 1;
            return -1;
        } else
            return 0;
    }

    public int getMinBorderForRandomNumber() {
        return minBorderForRandomNumber;
    }

    public int getMaxBorderForRandomNumber() {
        return maxBorderForRandomNumber;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public ArrayList<Integer> getHistoryOfPlayerAttempts() {
        return historyOfPlayerAttempts;
    }
}
