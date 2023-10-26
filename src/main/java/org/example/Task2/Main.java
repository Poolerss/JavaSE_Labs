package org.example.Task2;

public class Main {
    public static void main(String[] args) {
        PublishingHouse prospekt = new PublishingHouse("Москва", "Проспект");
        PublishingHouse piter = new PublishingHouse("Санкт-Петербург", "Питер");
        PublishingHouse bhw = new PublishingHouse("Санкт-Петебург", "БХВ");
        PublishingHouse dialectika = new PublishingHouse("Киев", "Даилектика");

        Book[] bookList = new Book[5];

        bookList[0] = new Book("\"Computer Science: основы программирования на Java, ООП, алгоритмы\"" +
                "и структуры данных", new String[] {"Седжвик Роберт", "Уэйн Кевин"}, 2018, piter);
        bookList[1] = new Book("\"Разработка требований к программному обеспечению.\"" +
                "3-е издание, дополненное", new String[] {"Вингерс Карл"}, 2019, bhw);
        bookList[2] = new Book("\"Java. Полное руководство, 10-е издание\"", new String[]{"Гербердт Шилдт"},
                2018,dialectika);
        bookList[3] = new Book("\"С/С++. Процедуурное программирование\"", new String [] {"Полубенцева М.И."},
                2017, bhw);
        bookList[4] = new Book("\"Конституция РФ\"", 2020, prospekt);

        Book.printAll(bookList);

        bhw.setPublishingHouseCity("Санкт-Петербург");
        /* Значение изменилось потому что мы меняем не ссылку, а сам объект в динамической памяти.
         */
        Book.printAll(bookList);

    }
}
