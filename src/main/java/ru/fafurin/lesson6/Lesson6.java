package ru.fafurin.lesson6;

import java.util.Scanner;

// Урок 6. Ветвление
public class Lesson6 {
    public static void main(String[] args) {

        // 1. Пользователь вводит дробное число. Если оно больше пи, вывести “pimore”
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        if (number > Math.PI) System.out.println("pimore");

        // 2. Пользователь вводит строку. Используя метод .contains(‘ ‘) пробел, определите, ввел пользователь одно слово, или больше
        String str = sc.nextLine();

        if (str.contains(" ")) System.out.println("Вы ввели несколько слов");
        else System.out.println("Вы ввели одно слово");

        // 3. Пользователь вводит четыре числа. Найти наибольшее из них.
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Максимальное число: " + Math.max(Math.max(x, y), Math.max(z, c)));
    }









    // Возвращает курс доллара к рублю на текущую дату
//    private static String getTodayDollarCoast() {
//        String str = "";
//        try {
//            str = (downloadWebPage("https://www.cbr-xml-daily.ru/daily_utf8.xml"));
//            str = str.substring(str.indexOf("<Valute ID=\"R01235\">"), str.indexOf("<Valute ID=\"R01239\">"));
//            str = str.substring(str.indexOf("<Value>") + 7, str.indexOf("</Value>"));
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        return str;
//    }

//    private static String downloadWebPage(String url) throws IOException {
//        StringBuilder res = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream(); BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = br.readLine()) != null) {
//                res.append(line);
//            }
//        }
//        return res.toString();
//    }

}
