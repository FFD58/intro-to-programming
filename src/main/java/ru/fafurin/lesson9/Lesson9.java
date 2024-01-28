package ru.fafurin.lesson9;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

// Урок 9. Ввод-вывод

public class Lesson9 {
    public static void main(String[] args) throws IOException {

        // 1. Пользователь вводит три строки, выведите в обратном порядке.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();

        printReverseWord(str1);
        printReverseWord(str2);
        printReverseWord(str3);

        // 2. Используя System.in (без сканнера), считайте слово из 5 букв
        InputStream stream = System.in;
        String result = "";
        for (int x = 0; x < 5; x++) {
            char word = (char) stream.read();
            result += word;
        }
        System.out.println(result);

        // 3. Используя System.in (без сканнера),считайте слово до пробела. Макс размер слова 10 символов.
        result = "";
        for (int x = 0; x < 10; x++) {
            char word = (char) stream.read();
            if (word != ' ') {
                result += word;
            } else break;
        }
        System.out.println(result);

        // 4. Используя Scanner на основе FileInputStream, прочесть из файла строку: название другого файла.
        // Из этого другого файла прочесть название третьего файла, и в третий файл записать букву,
        // которую пользователь введет через System.in (без сканера)

        String file1 = "file1.txt";

        InputStream fileInputStream = new FileInputStream(file1);
        Scanner cs = new Scanner(fileInputStream);

        fileInputStream = new FileInputStream(cs.nextLine());
        cs = new Scanner(fileInputStream);

        String filename = cs.nextLine();

        stream = System.in;
        char letter = (char) stream.read();

        FileWriter writer = new FileWriter(filename);
        writer.write(letter);
        writer.close();

        // 5. Пользователь вводит 7 символов. Используя System.in (без сканнера),
        // считайте целое число до первой нецифры.(пример: «35 руб», ответ 35.)
        // считаем, что первым пользователь всегда вводит цифру.
        // 6. Аналогично предыдущей задаче, но пользователь всегда вводит дробное число (пример ввода: «3.5 кг»)
        printNumbers(7);

        // 7. Пользователь вводит 10 строк. Те из них, в которых есть восклицательный знак, выведите в stderr. Попробуйте использовать цикл.
        for (int x = 0; x < 10; x++) {
            String str = sc.nextLine();
            if (str.contains("!")) System.err.println(str);
        }


        // 8. Пользователь вводит 10 строк, потом число max. Вывести в stdout те строки,
        // длинна которых меньше max, а в stderr те, длинна которых больше, обрезав по max.
        printStringByMaxLength(10, 7);
    }

    private static void printCharCode() throws IOException {
        System.out.println(System.in.read());
    }

    // 5. Пользователь вводит 7символов. Используя System.in (без сканнера),
    // считайте целое число до первой нецифры.(пример: «35 руб», ответ 35.)
    // считаем, что первым пользователь всегда вводит цифру.
    // 6. Аналогично предыдущей задаче, но пользователь всегда вводит дробное число (пример ввода: «3.5 кг»)
    private static void printNumbers(int length) throws IOException {
        while (length > 0) {
            InputStream stream = System.in;
            int charCode = stream.read();
            char letter = (char) charCode;
            if (charCode >= 46 && charCode <= 57) {
                System.out.print(charCode == 47 ? "" : letter);
            }
            length--;
        }
    }

    // 8. Пользователь вводит 10 строк, потом число max. Вывести в stdout те строки,
    // длинна которых меньше max, а в stderr те, длинна которых больше, обрезав по max.
    private static void printStringByMaxLength(int number, int maxLength) {
        Scanner sc = new Scanner(System.in);
        while (number > 0) {
            String str = sc.nextLine();
            if (str.length() < maxLength) System.out.println(str);
            else System.err.println(str.substring(0, maxLength));
            number--;
        }
    }

    private static void printReverseWord(String str) {
        for (int x = str.length() - 1; x >= 0; x--) {
            System.out.print(str.charAt(x));
        }
        System.out.println();
    }


}
