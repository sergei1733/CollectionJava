package com.company.section3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
5) Напишите методы union(Set<?>... set) и intersect(Set<?> ... set), реализующих операции объединения и
   пересечения множеств. Протестируйте работу этих методов на предварительно заполненных множествах.
 */
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        Set<Integer> union1 = new TreeSet<>();
        Set<Integer> union2 = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            union1.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            union2.add(in.nextInt());
        }
        System.out.println(union(union1,union2));

        System.out.println(intersect(union1,union2));
    }

    public static Set union(Set<Integer> union1, Set<Integer> union2){
        union1.addAll(union2);
        return union1;

    }

    public static Set intersect(Set<Integer> union1, Set<Integer> union2){
        union1.retainAll(union2);
        return union1;
    }


}
