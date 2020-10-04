package com.company.section2;

import java.sql.SQLOutput;
import java.util.*;
/*
4) Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
   Избавиться от повторяющихся элементов в строке и вывести результат на экран.
 */
public class Main {

    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
	String s;
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(s= in.nextLine());
        }
        System.out.println(set);
    }
}
