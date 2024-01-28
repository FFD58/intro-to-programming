package ru.fafurin;

// Урок 4. Введение в типы данных
public class Lesson4 {
    public static void main(String[] args) {

        //  1. Составьте программу, которая переводит переменную из byte в short
        byte x = 12;
        short s = (short)x;
        System.out.println(s + 1664);

        // 2. Составьте программу, которая переводит переменную из short в int
        int xx = (int) x;
        System.out.println(xx + 1221413);

        // 3. Составьте программу, которая переводит переменную из int в long
        long y = (long) xx;
        System.out.println(y + 122141334534323L);

        // 4. Составьте программу, которая переводит переменную из long в int
        int yy = (int) y;
        System.out.println(yy);

        // 5. Составьте программу, которая переводит переменную из float в double
        float j = 123.923F;
        double d = j;

        // 6. Составьте программу, которая переводит переменную из double в float
        j = (float)d;
        System.out.println(j);

        // 7. Придумайте способ переводить из int в boolean и наоборот.
        System.out.println(intToBoolean(0));

        // 8. Придумайте способ переводить из String в boolean.
        System.out.println(stringToBoolean("234234"));
        System.out.println(stringToBoolean("0"));

        // 9. Переведите переменную из char в string
        char c = 'a';

        String str = String.valueOf(c);

        System.out.println(str);

        // 10. Переведите переменную из char в int и наоборот.
        int ss = c;
        System.out.println(ss);
        char cc = (char) ss;

        System.out.println(cc);

        // 11. Пусть int равен от 30 до 150. Переведите каждый int в char, и выведите таблицу, где на каждой строчке есть int и соответствующий ему char
        printCharsetUTF8Form30To150();

//        printCharsetUTF8();
    }

    // 7. Придумайте способ переводить из int в boolean и наоборот.
    private static boolean intToBoolean(int number) {
        return number != 0;
    }

    // 8. Придумайте способ переводить из String в boolean.
    private static boolean stringToBoolean(String str) {
        return !str.equals("0");
    }

    // 11. Пусть int равен от 30 до 150. Переведите каждый int в char, и выведите таблицу, где на каждой строчке есть int и соответствующий ему char
    private static void printCharsetUTF8Form30To150() {
        for (int x = 30; x <= 150; x++) {
            char value = (char) x;
            System.out.println(x + " " + value);
        }
    }

//    private static void digitOrNot() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter the char");
//        char c = sc.next().charAt(0);
//        if (c >= '0' && c <= '9') {
//            System.out.println("Yor entered a digit");
//        } else System.out.println("You entered not a digit");
//    }
//
//    private static void printCharsetUTF8() {
//        int charCode = 140;
//        char value = (char) charCode;
//
//        while (charCode < 170) {
//            System.out.println(charCode + " " + value);
//            charCode++;
//            value = (char) charCode;
//        }
//    }

}
