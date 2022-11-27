package view.impl;

import view.View;
import model.File;

public class ViewImpl implements View {

    private static ViewImpl instance;

    private ViewImpl() {
    }

    public static ViewImpl getInstance() {
        if (instance == null) {
            instance = new ViewImpl();
        }
        return instance;
    }

    public void print(File file) {
        System.out.println(file);
    }

    public void print(String text) {
        System.out.println(text);
    }
}
