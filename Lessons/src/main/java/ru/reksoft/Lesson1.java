package ru.reksoft;

public class Lesson1 {

    public static void main(String[] args) {

        FootTeam spartak = new FootTeam("Spartak");
        spartak.addPlayer(new Player("Petrov Vasiliy",true, TypePlayer.FORWARD));

        System.out.println(spartak.name);
        System.out.println(spartak.team.get(0).fullName);





       /* String[] books = {"Буратино", "Вий", "Капитанская дочка", "Муy", "Евгений Онегин", "Гарри Потер", "Война и мир", "Темная башня", "Книга9", "Книга10"};
        int big_i = 0;
        int small_i = 0;
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
        String[] books_small = new String[10];
        String[] books_big = new String[10];
        for (String book : books) {
            if (book.length() == small_l) {
                books_small[small_i] = book;
                small_i++;
            }
            if (book.length() == big_l) {
                books_big[big_i] = book;
                big_i++;
            }

        }

        for (String s : books_small) {
            System.out.println(s);
        }

        for (String s : books_big) {
            System.out.println(s);
        }*/
//        System.out.println(books_small);
//        System.out.println(books_big);
    }
}