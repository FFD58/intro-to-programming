package ru.fafurin.lesson7;

import java.util.Scanner;

// Урок 7. Логические операторы
public class Lesson7 {
    public static void main(String[] args) {

        // Задание 1. Написать простой булев калькулятор
        booleanCalculator();
    }

    private static void booleanCalculator() {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char x = str.charAt(0);
        char operator = str.charAt(1);
        char y = str.charAt(2);

        boolean xValue = x == '1';

        boolean yValue = y == '1';

        if (operator == '&') {
            System.out.println(xValue && yValue);
        } else if (operator == '|') {
            System.out.println(xValue || yValue);
        } else System.out.println("Unknown operator");

    }

    // Задание 2. Решите логическую загадку. Советую решать ее без помощи интернета, чтобы полностью осознать логику задачи.

    //месяцы                   даты
    //
    // май                 15  16          19
    // июнь                        17  18
    // июль            14      16
    // август          14  15      17


    // Альберту месяц - май, июнь, июль, август
    // Бернарду день -  14, 15, 16, 17, 18, 19

    // Альберт: Я не знаю, когда у Шерил день рождения, но я знаю, что Бернард тоже не знает.
    // Значит отпадают даты, которые не повторяются. Это 18 и 19, соответственно отпадают май и июнь.

    // Бернард: Поначалу я не знал, когда у Шерил день рождения, но знаю теперь.
    // Значит это не 14, так как эта дата есть в двух месяцах.
    // 15 и 17 тоже не подходят, так как мы вычеркнули май и июнь.

    // Ответ: 16 июля!

}
