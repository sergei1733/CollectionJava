package com.company.section1;

import java.util.ArrayList;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        ArrayList<HeavyBox> box = new ArrayList();

        for (int i = 0; i < 10; i++) {
            box.add(new HeavyBox("элемент " + i));
        }
        for (HeavyBox i : box) {
            System.out.println(i.getName());
        }
        System.out.println("/////////////////////");

        var h1 = new HeavyBox("замена элемента");
        box.set(1, h1);

        box.remove(box.size() - 1);

        for (HeavyBox i : box) {
            System.out.println(i.getName());
        }

        box.clear();
        System.out.println();
        System.out.println(box.size());

        /*
        3) Создать TreeSet содержащий HeavyBox. HeavyBox должен реализовать интерфейс Comparable.
        Распечатать содержимое с помощью for each.
         */
        System.out.println("new TreeSet");
        TreeSet<HeavyBox> treeSet =  new TreeSet<>();
        for (int i = 5; i >= 0; i--) {
            treeSet.add(new HeavyBox("treeSet " + i));
        }
        for (HeavyBox a : treeSet) {
            System.out.println(a.getName());
        }

    }
}
