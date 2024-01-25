package ru.fafurin.lesson5;

import java.util.Scanner;

// Урок 5. Арифметические операторы
public class Lesson5 {

    public static void main(String[] args) {
        // 1. Пользователь вводит два числа. Возвести второе в степень первого
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(Math.pow(y, x));


        // 2. Пользователь вводит три числа. Возвести 1 в степень 2, и результат в степень 3.
        // 3. Решить предыдущую задачу, но Math.pow можно использовать только на одной строчке вашей программы(хоть и много раз)
        int xx = sc.nextInt();
        int yy = sc.nextInt();
        int zz = sc.nextInt();
        System.out.println(Math.pow(Math.pow(xx, yy), zz));

        // 4. Пользователь вводит, две строки. Найти разницу в длине.
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(Math.abs(str1.length() - str2.length()));

        // 5. Пользователь вводит три строки. Найти разницу в длине самой короткой и самой длинной.
        // 6. Решить предыдущую задачу, не используя операторы >,< итд.
        String str3 = sc.nextLine();
        System.out.println(findDifferenceLengthShortestAndLongestString(str1, str2, str3));

        // 7. Сделать калькулятор для трех чисел: пользователь вводит первое, потом оператор, второе, оператор, третье. Посчитать первое на второе, потом результат с третьим.
        // 8. Решить предыдущую задачу, но операции считать по приоритету (умножение и деление выше сложения вычитания).
        Calculator calculator = new Calculator(sc);
        System.out.println(calculator);
        calculator.start();

        // 9. Вывести английский алфавит
        printEnglish();

        // 10. Пользователь вводит N. Вывести букву английского алфавита по счету N.
        System.out.println("Enter a number for English letter (from 65 to 90 and 96 to 123)");
        int n = sc.nextInt();
        printEnglishLetter(n);

        // 11. Вывести случайную букву английского алфавита.
        System.out.println(returnRandomEnglishLetter());

        // 12. Вывести случайное число от 11 до 22
        System.out.println((int) (Math.random() * 12 + 11));

    }

    // Метод для 5 и 6 задач. Возвращает разницу в длине самой короткой и самой длинной строки
    private static int findDifferenceLengthShortestAndLongestString(String str1, String str2, String str3) {
        return Math.abs(Math.max(Math.max(str1.length(), str2.length()), str3.length()) -
                Math.min(Math.min(str1.length(), str2.length()), str3.length()));
    }

    // Выводит английский алфавит для 9 задачи
    private static void printEnglish() {
        int letter = 65;
        while (letter < 123) {
            System.out.print((char) letter + " ");
            letter++;
            if (letter == 91) letter += 6;
        }
        System.out.println();
    }

    // Выводит букву английского алфавита по введенному коду для 10 задачи
    private static void printEnglishLetter(int charCode) {
        if (charCode >= 65 && charCode < 123) {
            if (charCode >= 91 && charCode <= 96) {
                System.out.println("Этому коду не соответствует буква английского алфавита");
            } else System.out.println((char) charCode);
        } else System.out.println("Этому коду не соответствует буква английского алфавита");
    }

    // Выводит случайную букву английского алфавита для 11 задачи
    private static char returnRandomEnglishLetter() {
        int random = (int) (Math.random() * 26 + 97);
        return (char) random;
    }










    // вывод в консоль случайной русской гласной буквы
//    private static char returnRandoVowelLetter() {
//        String vowelLetters = "аеоиуыэюя";
//        int random = (int) (Math.random() * 9 + 1);
//        return vowelLetters.charAt(random - 1);
//    }

    // вывод в консоль случайного сочетания русских букв (гласных и согласных)
//    private static void printRandomWord(int letterNumber) {
//        while (letterNumber > 0) {
//            System.out.print(returnRandomLetter());
//            System.out.print(returnRandoVowelLetter());
//            letterNumber--;
//        }
//    }
}
