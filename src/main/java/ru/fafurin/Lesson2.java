package ru.fafurin;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

// Урок 2. Практика программирования: переменные, ветвления, циклы. Введение в String API. Использование готовых методов: скачиваем веб-страницу, сохраняем в файл

public class Lesson2 {
    public static void main(String[] args) throws IOException {

        // 1. Если 5 в 15 степени больше миллиарда, вывести - «Степень это мощь. Power is a power.»
        if (Math.pow(5, 15) > 1000000000) System.out.println("Степень это мощь. Power is a power");

        // 2. Задайте переменную. Если она больше 0, вывести «позитив», если меньше 0, вывести «отрицательно»
        int x = -5;
        if (x > 0) System.out.println("Позитив");
        else if (x < 0) System.out.println("Отрицательно");

        // 3. Если квадратный корень из 15 миллионов меньше 5 тысяч, вывести - «два измерения лучше, чем одно»
        if (Math.sqrt(15000000) < 5000) System.out.println("два измерения лучше, чем одно");

        // 4. Если 2 в 10 степени меньше 512 вывести - «Pentium 2», иначе вывести - «ARM»
        if (Math.pow(2, 10) < 512) {
            System.out.println("Pentium 2");
        } else System.out.println("ARM");

        // 5. Задать две дробных переменных. Вывести наибольшую из них.
        double a = 6.124335;
        double b = 2.124335;

        System.out.println(Math.max(a, b));

        // 6. Задать две переменных - first и second. Вывести first в степени second, second в степени first.
        int first = 12;
        int second = 4;

        System.out.println(Math.pow(first, second));
        System.out.println(Math.pow(second, first));

        // 7. Задать две переменных - икс и игрек. Вывести, что больше - икс в степени игрек, или наоборот.
        int xx = 3;
        int yy = 5;

        if (Math.pow(xx, yy) > Math.pow(yy, xx)) System.out.println(Math.pow(xx, yy));
        else System.out.println(Math.pow(yy, xx));

        // 8. Вывести числа от 1 до 100
        printNumbers(1, 100);

        // 9. Вывести числа от 50 до 100
        printNumbers(50, 100);

        // 10. Вывести числа от 100 до 1
        printNumbers(100, 1);

        // 11. Вывести числа от 0 до -100
        printNumbers(0, -100);

        // 12. Задать строковую переменную. Заменить в ней все буквы о на «обро»
        String str = "оголтелая оттепель";
        System.out.println(str.replace("о", "обро"));

        // 13. Задать строковую переменную. Вывести ее в верхнем регистре.
        System.out.println(str.toUpperCase());

        // 14. Задать строковую переменную. Заменить в ней буквы а на @, а буквы о на 0.
        str = str.replace("а", "@");
        System.out.println(str.replace("о", "0"));

        // 15. Задать две строковых переменных. Найти, какая из них длиннее. (Используйте .length() )
        String str2 = "qwerty";

        if (str.length() > str2.length()) {
            System.out.println("Первая строка длиннее");
        } else if (str.length() < str2.length()) {
            System.out.println("Вторая строка длиннее");
        } else System.out.println("Длины срок равны");

        // 16. Задать три переменных, найти наибольшую из них
        int k = 3455;
        int l = 12213312;
        int m = 456;

        if (k > l && k > m) {
            System.out.println(k + " больше " + l + " и " + m);
        } else if (l > m && l > k) {
            System.out.println(l + " больше " + m + " и " + k);
        } else System.out.println(m + " больше " + l + " и " + k);

        // 17. Напишите программу, сохраняющую в файл статью из википедии «Проблема 2000 года». Прочитайте её.
        writeToFile(downloadWebPage("https://ru.wikipedia.org/wiki/Проблема_2000_года"), "wiki.html");

        // 18. Напишите программу, сохраняющую в файл статью из википедии «Дональд Кнут». Перед сохранением в файл замените все слова Кнут на Пряник
        String dk = downloadWebPage("https://ru.wikipedia.org/wiki/Кнут,_Дональд_Эрвин");
        writeToFile(dk.replace("Кнут", "Пряник"), "knut.html");

        // 19. Напишите программу, которая сохраняет в файл случайную статью из Википедии. (Ссылку на случайную статью можно найти на вики в меню слева: https://ru.wikipedia.org/wiki/%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%D0%BD%D0%B0%D1%8F:%D0%A1%D0%BB%D1%83%D1%87%D0%B0%D0%B9%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0 )
        String randomWikiArticle = "https://ru.wikipedia.org/wiki/%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%" +
                "D0%BD%D0%B0%D1%8F:%D0%A1%D0%BB%D1%83%D1%87%D0%B0%D0%B9%D" +
                "0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0";
        writeToFile(downloadWebPage(randomWikiArticle), "random.html");

        // 20. Сложная. Напишите программу, которая сохраняет в разные файлы 50 случайных статей из Википедии
        writeToFileRandomWikiArticles(3);

    }

    // Метод для вывода целых чисел для заданий 8-11
    private static void printNumbers(int from, int to) {
        if (from < to) {
            for(int x = from; x <= to; x++) {
                System.out.println(x + " ");
            }
        } else if (from > to) {
            for(int x = from; x >= to; x--) {
                System.out.println(x + " ");
            }
        } else System.out.println(from);

    }

    // Метод возвращает строку из содержимого веб-страницы с адресом ulr для заданий 17-20
    private static String downloadWebPage(String url) throws IOException {
        StringBuilder res = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream(); BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                res.append(line);
            }
        }
        return res.toString();
    }

    // Метод записывает содержимое строки str в файл с именем filename
    private static void writeToFile(String str, String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write(str);
        writer.close();
    }

    // 20. Сложная. Напишите программу, которая сохраняет в разные файлы 50 случайных статей из Википедии
    private static void writeToFileRandomWikiArticles(int count) throws IOException {
        String randomWikiArticle = "https://ru.wikipedia.org/wiki/%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%" +
                "D0%BD%D0%B0%D1%8F:%D0%A1%D0%BB%D1%83%D1%87%D0%B0%D0%B9%D" +
                "0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0";
        String dir = System.getProperty("user.dir") + "\\articles";
        Files.createDirectories(Paths.get(dir));
        while (count > 0) {
            String str = downloadWebPage(randomWikiArticle);
            int begin = str.indexOf("<title>");
            int end = str.indexOf("— Википедия</title>");
            String title = str.substring(begin + 7, end).replace(",","");
            writeToFile(str, dir + "\\" + title + ".html");
            count--;
        }
    }

}
