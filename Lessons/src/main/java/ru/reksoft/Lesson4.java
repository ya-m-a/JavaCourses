package ru.reksoft;

import java.util.ArrayList;

public class Lesson4 {
    public static void main(String[] args) {

        String[] books = {"Буратино", "Вий", "Капитанская дочка", "Муy", "Евгений Онегин", "Гарри Потер", "Война и мир", "Темная башня", "Робинзоннн Крузоо", "Маугли"};
        int big_l = books[0].length();
        int small_l = books[0].length();
        int i = 0;
        for (String book : books) {
            if (book.length() > big_l) {
                big_l = book.length();
            }
            if (book.length() < small_l) {
                small_l = book.length();
            }
        }
        ArrayList <String> books_small = new ArrayList<>();
        ArrayList <String> books_big = new ArrayList<>();
        for (String book : books) {
            if (book.length() == small_l) {
                books_small.add(book);
            }
            if (book.length() == big_l) {
                books_big.add(book);
            }

        }

        System.out.println("Самое длинное название ("+big_l+" симв.):");
        System.out.println(books_big.toString());
        System.out.println("Самое короткое название ("+small_l+" симв.):");
        System.out.println(books_small.toString());


    }
}
