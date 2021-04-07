package com.company;

import com.company.components.Menu;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        int amountOfOperations = 30000;
        showInfo(amountOfOperations, arrayList, linkedList);
    }

    public static void showInfo(int amountOfOperations,  ArrayList<String> arrayList, LinkedList<String> linkedList){
        System.out.println("\nAmount of operations:  " + amountOfOperations);
        System.out.println("Array list add: " + Menu.getTimeAdd(amountOfOperations, arrayList) + " ms");
        System.out.println("Linked list add: " + Menu.getTimeAdd(amountOfOperations, linkedList) + " ms");
        System.out.println("\nArray list get: " + Menu.getTimeGet(amountOfOperations, arrayList) + " ms");
        System.out.println("Linked list get: " + Menu.getTimeGet(amountOfOperations, linkedList) + " ms");
        System.out.println("\nArray list delete: " + Menu.getTimeDelete(amountOfOperations, arrayList) + " ms");
        System.out.println("Linked list delete: " + Menu.getTimeDelete(amountOfOperations, linkedList) + " ms");
        System.out.println("\nSize of array list:  " + arrayList.size());
        System.out.println("Size of linked list:  " + linkedList.size());
    }

}
