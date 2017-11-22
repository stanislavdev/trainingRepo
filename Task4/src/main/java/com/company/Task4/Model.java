package com.company.Task4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by dvsta on 22.11.2017.
 */
public class Model {
    private ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
    private HashMap<Integer, Integer> countOfNumbers = new HashMap<Integer, Integer>();

    /**
     * This method count number of repeats in ArrayList.
     */
    public void countNumberOfRepeat() {
        for (int i = 0; i < integerArrayList.size(); i++) {
            Integer in = integerArrayList.get(i);
            if (countOfNumbers.containsKey(in)) {
                countOfNumbers.put(in, countOfNumbers.get(in) + 1);
            } else {
                countOfNumbers.put(in, 1);
            }
        }
    }

    public ArrayList<Integer> getIntegerArrayList() {
        return integerArrayList;
    }

    public void setIntegerArrayList(ArrayList<Integer> integerArrayList) {
        this.integerArrayList = integerArrayList;
    }

    public HashMap<Integer, Integer> getCountOfNumbers() {
        return countOfNumbers;
    }

    public void setCountOfNumbers(HashMap<Integer, Integer> countOfNumbers) {
        this.countOfNumbers = countOfNumbers;
    }
}
