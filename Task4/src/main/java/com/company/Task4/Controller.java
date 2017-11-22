package com.company.Task4;

import java.util.Arrays;

/**
 * Created by dvsta on 22.11.2017.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void findRepeats(){
        model.getIntegerArrayList().addAll(Arrays.asList(4, 5, 6, 4, 5, 3, 4, 2, 4, 5, 7));
        model.countNumberOfRepeat();
        view.printHashMap(model.getCountOfNumbers());
    }
}
