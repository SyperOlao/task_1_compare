package com.company.components;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Menu {
    private ArrayList<String> arrayList = new ArrayList<>();
    private LinkedList<String> linkedList = new LinkedList<>();

    public static double getTimeAdd(int amountOfOperations, List<String> list){
        long time = System.currentTimeMillis();
        for (int i = 0; i <amountOfOperations ; i++) {
            list.add(String.valueOf(new Random().nextInt(100)));
        }
        return System.currentTimeMillis() - time;
    }
}
