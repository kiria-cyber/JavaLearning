package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> numbersNames = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        names.add("Jhon");
        names.add("Nick");
        names.add("Adam");
        names.add("Alex");
        names.add("Kevin");
        names.add("James");
        names.add("Kate");
        names.add("Jinx");
        names.add("Vi");
        names.add("Xiomi");

        for (int i = 0; i < numbers.size(); i++) {
            String s = numbers.get(i) + " - " + names.get(i);
            numbersNames.add(s);
        }

        for (String name : numbersNames) {
            System.out.println(name);
        }
    }
}


