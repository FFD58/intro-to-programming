package ru.fafurin;

import java.util.Scanner;

// Урок 3. Переменные. Оперативная память. Дебаг.

public class Lesson3 {
    public static void main(String[] args) {

        // 1. Где хранятся переменные? Сколько переменных можно задать в программе? Чем ограничен размер?
        // Переменные хранятся в оперативной памяти. Количество переменных ограничено оперативной памятью.
        // Размер переменной ограничен размером типа данных этой переменной.

        // 2. Пользователь вводит строку, выведите ее длину
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        System.out.println(str1.length());

        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        // 3. Пользователь вводит две строки, выведите сумму их длин
        System.out.println(str1.length() + str2.length());

        // 4. Пользователь вводит три строки. Найти, какая из них короче всех.
        int min = 0;
        if (str1.length() < str2.length() && str1.length() < str3.length()) {
            min = str1.length();
        } else if (str2.length() < str1.length() && str2.length() < str3.length()) {
            min = str2.length();
        } else {
            min = str3.length();
        }
        System.out.println(min);

        // 5. Пользователь вводит три дробных числа. Вывести те из них, квадратный корень которых меньше 2.
        System.out.println("Введите три дробных числа");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        printDoubleNumberLess2(x);
        printDoubleNumberLess2(y);
        printDoubleNumberLess2(z);

        // 6. Пройдите в дебаге программу:
        // int x = 1;
        // while (x>=-3) {
        //      System.out.print(x);
        //      x = x - 1;
        // }
        // Сколько раз выводится икс?
        // Ответ: 5.


//        7. Пройдите в дебаге программу:
//        String str = “Hell”;
//        while (str.length()<10) {
//            str = str + “o”;
//        }
        // Сколько раз вызывается метод str.length() ?
        // Ответ: 7.

        // 8. Пользователь вводит два числа. Разделить меньшее на большее и вывести результат.
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) System.out.println((double) num2 / num1);
        else System.out.println((double) num1 / num2);

        // 9. Пользователь вводит строку. Используя substring, вывести первые 5 символов.
        System.out.println(str1.substring(0, 5));

        // 10. Считайте boolean-переменную. Если пользователь ввел true, вывести “истина”, иначе ничего не стоит выводить
        boolean bool = scanner.nextBoolean();
        if (bool) System.out.println("Истина");

        // 11. Пользователь вводит 3 числа. Сделайте три boolean переменных: есть ли среди введённых четное, есть ли среди введённых отрицательное, есть ли число больше тысячи
        for (int j = 0; j < 3; j++) {
            int h = scanner.nextInt();
            if (isEvenNumber(h)) System.out.println(h + " четное число");
            if (isNegativeNumber(h)) System.out.println(h + " отрицательное число");
            if (isNumberBigger1000(h)) System.out.println(h + " больше 1000");
        }

        // 12. Пользователь вводит три строки, используя .substring(0, x) выведите эти строки, обрезав те, что длиннее самой короткой. Пример ввода: «повар», «поделка», «лампочка». Вывод: «повар», «подел», «лампо»
        System.out.println(str1.substring(0, min));
        System.out.println(str2.substring(0, min));
        System.out.println(str3.substring(0, min));


        // 13. Мини-игра в слова. Первый игрок вводит слово. Потом второй игрок вводит два числа, с какого по какой символ можно найти слово внутри исходного, используя substring. Потом первый игрок вводит два числа. Побеждает тот, чье слово длиннее. Пример:
        stringGame();
        }

    private static boolean isEvenNumber(int numb) {
        return numb % 2 == 0;
    }

    private static boolean isNegativeNumber(int numb) {
        return numb < 0;
    }

    private static boolean isNumberBigger1000(int numb) {
        return numb > 1000;
    }

    private static void stringGame() {
        int player = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок № " + player + " Введите слово: ");
        player++;
        String word = scanner.nextLine();
        for (int k = 0; k < word.length(); k++) {
            System.out.print(k);
        }
        System.out.println();
        String answer1 = "";
        String answer2 = "";
        answer1 = playerMove(player, word);
        System.out.println("Игрок № " + player + " ваше слово: " + answer1);

        player--;
        answer2 = playerMove(player, word);
        System.out.println("Игрок № " + player + " ваше слово: " + answer2);

        stringСomparison(answer1, answer2);
    }

    private static void stringСomparison(String str1, String str2) {
        if (str1.length() > str2.length()) {
            System.out.println("Слово " + str1 + " (" + str1.length() + ") длинее " + str2 + " (" + str2.length() + ").");
        } else if (str1.length() < str2.length()) {
            System.out.println("Слово " + str2 + " (" + str2.length() +  " длинее " + str1 + " (" + str1.length() + ").");
        } else System.out.println("Слова " + str1 + " и " + str2 + " одинаковой длины.");
    }

    private static String playerMove(int player, String word) {
        System.out.println("Игрок № " + player + " Введите два числа, с какого по какой символ можно найти слово внутри исходного");
        Scanner scanner = new Scanner(System.in);
        int begin = scanner.nextInt();
        int end = scanner.nextInt();
        return word.substring(begin, end + 1);
    }

    // 5. Пользователь вводит три дробных числа. Вывести те из них, квадратный корень которых меньше 2.
    private static void printDoubleNumberLess2(double x) {
        if (Math.sqrt(x) < 2) System.out.println(x);
    }
}