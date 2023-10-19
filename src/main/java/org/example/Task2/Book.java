package org.example.Task2;

import java.util.Arrays;

public class Book {
    private String name;
    private PublishingHouse publishingHouse;
    private int publishingYear;
    private String[] bookAuthors;

    //Constructors
    public Book (String name, int publishingYear, PublishingHouse publishingHouse){
        setName(name);
        setPublishingYear(publishingYear);
        setPublishingHouse(publishingHouse);
    }
	
    public Book (String name, String[] bookAuthors, int publishingYear, PublishingHouse publishingHouse){
        setName(name);
        setBookAuthors(bookAuthors);
        setPublishingYear(publishingYear);
        setPublishingHouse(publishingHouse);;}

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
    
	
    public String[] getBookAuthors() {
        return bookAuthors;
    }
	
    public int getAuthorsNumbers(){
        return bookAuthors.length;
    }
	
    public  String getAuthorByIndex(int index){
            try{
			return bookAuthors[index];
	} catch (Exception e){
		System.out.println ("illegal index");
			return null;
		}   
	}
   //Setters

    public void setName(String name) {
        if(!name.isEmpty())
            this.name = name;
        else
		        throw new IllegalArgumentException("name is empty");
    }
	
    public void setPublishingHouse(PublishingHouse publishingHouse) {
        if (publishingHouse!=null)
            this.publishingHouse = publishingHouse;
        else
            throw new IllegalArgumentException("publishingHouse is null");
    }
	
    public void setPublishingYear(int publishingYear) {
        if (publishingYear>=0)
            this.publishingYear = publishingYear;
        else
            throw new IllegalArgumentException("publishingYear is not valid");
    }

/*
    public void setBookAuthors(String... bookAuthors) {
        if (bookAuthors != null && bookAuthors.length > 0) {
            if (this.bookAuthors == null) {
                this.bookAuthors = bookAuthors;
            } else {
                String[] newBookAuthors = new String[this.bookAuthors.length + bookAuthors.length];
                int index = 0;

                for (String author : this.bookAuthors) {
                    newBookAuthors[index] = author;
                    index++;
                }

                for (String author : bookAuthors) {
                    newBookAuthors[index] = author;
                    index++;
                }

                this.bookAuthors = newBookAuthors;
            }
        } else {
            this.bookAuthors = null;
            System.out.println("bookAuthors is empty or null");
        }
    }
*/

    public void setBookAuthors(String... bookAuthors) {
        if (bookAuthors != null && bookAuthors.length > 0 && !Arrays.asList(bookAuthors).stream().anyMatch(String::isBlank)) {
            if (this.bookAuthors == null) {
                this.bookAuthors = bookAuthors;
            } else {
                String[] newBookAuthors = Arrays.copyOf(this.bookAuthors, this.bookAuthors.length + bookAuthors.length);
                System.arraycopy(bookAuthors, 0, newBookAuthors, this.bookAuthors.length, bookAuthors.length);
                this.bookAuthors = newBookAuthors;
            }
        } else {
            throw new IllegalArgumentException("bookAuthors is empty or null");
        }
    }



    //Methods

    public void print(){
        System.out.println("Название книги:" + "\t"+ name);

          if (bookAuthors!=null){
            System.out.print("Авторы:" + "\t\t\t");
            for (String author : bookAuthors){
                System.out.print(author + ", ");
            }}
			else {
			System.out.print("Авторы: \t\tотсутствуют");}
            System.out.print("\n");
        

        System.out.print("Издательство:" + "\t");
        publishingHouse.print();
        System.out.println("");
        System.out.println("Год издания:" + "\t"+ publishingYear);
        System.out.println("_______________________________________________");

    }
    public static void printAll(Book[] booklist) {
        if (booklist != null) {
            for (Book book : booklist) {
                if (book != null) {
                    book.print();
                }
            }
        }
    }

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

        printAll(bookList);

        bhw.setPublishingHouseCity("Санкт-Петербург");
       /* Значение изменилось потому что мы меняем не ссылку, а сам объект в динамической памяти.
            */
        printAll(bookList);



    }

}
