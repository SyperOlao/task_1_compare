package com.company.components;

import java.util.List;
import java.util.Random;

public class Menu {

    public static double getTimeAdd(int amountOfOperations, List<String> list){
        double time = System.currentTimeMillis();
        for (int i = 0; i <amountOfOperations ; i++) {
            list.add(String.valueOf(new Random().nextInt(1000)));
        }
        return System.currentTimeMillis() - time;
    }

    public static double getTimeDelete(int amountOfOperations, List<String> list){
        if (amountOfOperations > list.size()) amountOfOperations = list.size();
        double time = System.currentTimeMillis();
        list.subList(0, amountOfOperations).clear();
        return System.currentTimeMillis() - time;
    }

    public static double getTimeGet(int amountOfOperations, List<String> list){
        if (amountOfOperations > list.size()) amountOfOperations = list.size();
        //Временный массив чтобы в него записывался метод гет
        String[] temp_arr = new String[amountOfOperations];
        double time = System.currentTimeMillis();
        for (int i = 0; i < amountOfOperations; i++) {
            temp_arr[i] = list.get(i);
        }
        return System.currentTimeMillis() - time;
    }
}
