package com.company.Task4;

import java.util.HashMap;

/**
 * Created by dvsta on 22.11.2017.
 */
public class View {

    /**
     * Method for printing message.
     *
     * @param message
     * @return Noting.
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Method for concat strings.
     *
     * @param message Strings for concatenation
     * @return String This returns concatenated strings.
     */
    public String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printHashMap(HashMap<Integer, Integer> hashMap) {
        System.out.println("Value    Count of repeats");
        for (Integer key : hashMap.keySet()) {
            System.out.println(concatenationString(key.toString(),
                    "              ", hashMap.get(key).toString()));
        }
    }
}
