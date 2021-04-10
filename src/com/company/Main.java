package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(3);
        colors.add("Black");
        colors.add("Green");
        colors.add("Red");

        colors.ensureCapacity(6);
        colors.add("Pink");
        colors.add("Gold");
        colors.add("Silver");

        Collections.sort(colors);
        System.out.println("A to Z: ");
        System.out.println("==============");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Collections.reverse(colors);
        System.out.println("A to Z: ");
        System.out.println("==============");
        iterator.hasNext();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
