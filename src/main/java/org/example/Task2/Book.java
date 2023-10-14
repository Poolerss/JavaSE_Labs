package org.example.Task2;

import org.example.Task1.Country;

public class Book {
    private String name;
    private PublishingHouse publishingHouse;
    private int publishingYear;
    private String[] bookAuthors;
    private String bookAuthor;

    //Constructors
    public Book (String name, int publishingYear, PublishingHouse publishingHouse){
        this.name=name;
        this.publishingYear=publishingYear;
        this.publishingHouse=publishingHouse;
    }
    public Book (String name, String bookAuthor, int publishingYear, PublishingHouse publishingHouse){
        this.name=name;
        this.bookAuthor=bookAuthor;
        this.publishingYear=publishingYear;
        this.publishingHouse=publishingHouse;
    }
    public Book (String name, String[] bookAuthors, int publishingYear, PublishingHouse publishingHouse){
        this.name=name;
        this.bookAuthors=bookAuthors;
        this.publishingYear=publishingYear;
        this.publishingHouse=publishingHouse;}

    //Getters
    public String getName() {
        return name;
    }
    public PublishingHouse getPublishingHouse() {
        return publishingHouse;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public String[] getBookAuthors() {
        return bookAuthors;
    }
    public int getAuthorsNumbers(){
        return bookAuthors.length;
    }
    public  String getAuthorByIndex(int index){
        if(index < bookAuthors.length)
            return bookAuthors[index];
        else
            return "Нет такого автора. Всего авторов книги: " +  bookAuthors.length;
    }

    //Setters

    public void setName(String name) {
        if(!name.isEmpty())
            this.name = name;
        else
            System.out.println("Имя не может быть пустым");
    }
    public void setPublishingHouse(PublishingHouse publishingHouse) {
        if (publishingHouse!=null)
            this.publishingHouse = publishingHouse;
        else
            System.out.println("Издатель не может отсутствовать");
    }
    public void setPublishingYear(int publishingYear) {
        if (publishingYear>=0)
            this.publishingYear = publishingYear;
        else
            System.out.println("Год издания не может быть отрицательным");
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public void setBookAuthors(String[] bookAuthors) {
        this.bookAuthors = bookAuthors;
    }

    //Methods

    public void print(){
        System.out.println("Название книги:" + "\t"+ name);

        if (bookAuthor!=null){
            System.out.print("Автор:" + "\t\t");
            System.out.println("\t"+ bookAuthor);}
        else if (bookAuthors!=null){
            System.out.print("Авторы:" + "\t\t");
            for (String author : bookAuthors){
                System.out.print(author + ", ");
            }
            System.out.print("\n");
        }

        System.out.print("Издательство:" + "\t");
        publishingHouse.print();
        System.out.println("");
        System.out.println("Год издания:" + "\t"+ publishingYear);
        System.out.println("_______________________________________________");

    }
    public static void printAll(Book[] booklist) {
        for (Book book : booklist) {
            book.print();
        }
    }

    public static void main(String[] args) {

        PublishingHouse prospekt = new PublishingHouse("Москва", "Проспект");
        PublishingHouse piter = new PublishingHouse("Санкт-Петербург", "Питер");
        PublishingHouse bhw = new PublishingHouse("Санкт-Петебург", "БХВ");
        PublishingHouse dialectika = new PublishingHouse("Киев", "Даилектика");

        Book[] bookList = new Book[5];

        bookList[0] = new Book("Computer Science: основы программирования на Java, ООП, алгоритмы" +
                "и структуры данных", new String[] {"Седжвик Роберт", "Уэйн Кевин"}, 2018, piter);
        bookList[1] = new Book("Разработка требований к программному обеспечению." +
                "3-е издание, дополненное", "Вингерс Карл", 2019, bhw);
        bookList[2] = new Book("Java. Полное руководство, 10-е издание", "Гербердт Шилдт",
                2018,dialectika);
        bookList[3] = new Book("С/С++. Процедуурное программирование", "Полубенцева М.И.",
                2017, bhw);
        bookList[4] = new Book("Конституция РФ", 2020, prospekt);

        printAll(bookList);

        bhw.setPublishingHouseCity("Санкт-Петербург");
       /* Значение изменилось потому что мы меняем не ссылку, а само значение в динамической памяти.
       различные объекты это ссылки на значения. В данном случае ссылка на значение "Санкт Петербург".
            */
        printAll(bookList);



    }

}
