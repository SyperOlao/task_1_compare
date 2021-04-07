package com.company;

import com.company.components.Menu;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("Array list add: " + Menu.getTimeAdd(1000, arrayList));
        System.out.println("Linked list add: " + Menu.getTimeAdd(1000, linkedList));
    }
}
