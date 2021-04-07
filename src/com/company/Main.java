package com.company;

import com.company.components.Menu;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("Array list add: " + Menu.getTimeAdd(20000, arrayList) + " ms");
        System.out.println("Linked list add: " + Menu.getTimeAdd(20000, linkedList) + " ms");
        System.out.println("\nArray list delete: " + Menu.getTimeDelete(10000, linkedList) + " ms");
        System.out.println("Linked list delete: " + Menu.getTimeDelete(10000, arrayList) + " ms");
        System.out.println("Size of link:  " + linkedList.size());
        System.out.println("Size of arr:  " + arrayList.size());

    }
}
