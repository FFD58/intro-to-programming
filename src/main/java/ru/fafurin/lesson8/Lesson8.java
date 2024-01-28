package ru.fafurin.lesson8;

import java.util.Scanner;

// Урок 8. Тернарный оператор

public class Lesson8 {
    public static void main(String[] args) {

        // Задание 1-3.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int max;

        max2(x, y);
        max3(x, y, z);

        // Задание 4-8
        BreakingBadQuote quote = new BreakingBadQuote();

        // Выводит случайные цитаты из сериала "Во все тяжкие"
        quote.printRandomQuotesFromBreakingBad(5);

        // Выводит одну случайную цитату Walter White
        quote.printWalterWhiteQuotes();

    }
    private static void max2(int x, int y) {
        System.out.println(x > y ? x : y);
    }

    private static void max3(int x, int y, int z) {
        System.out.println(x > y && x > z ? x : y > z ? y : z);
    }

}
