package org.example.Task1;

import java.util.ArrayList;

public class Country {
    private String name;

    private long area; //при експонентной записи изменить на float
    private Long populations; //при експонентной записи изменить на Float используя обертку для проверки на null
    private String capitalName;
    private Long capitalPopulations; //при експонентной записи изменить на Float используя обертку для проверки на null

    //конструкторы
    public Country(String name, long area, long populations, String capitalName, long capitalPopulations) {
        this.name = name;
        this.area = area;
        this.populations = populations;
        this.capitalName = capitalName;
        this.capitalPopulations = capitalPopulations;
    }

    public Country(String name, long area, long populations) {
        this.name = name;
        this.area = area;
        this.populations = populations;
    }
    // только для неизвестного населения 26...36 строки
    public Country(String name, long area) {
        this.name = name;
        this.area = area;
    }
    public Country(String name, long area, String capitalName, long capitalPopulations) {
        this.name = name;
        this.area = area;
        this.capitalName = capitalName;
        this.capitalPopulations = capitalPopulations;
    }
    public Country(String name, long area, String capitalName) {
        this.name = name;
        this.area = area;
        this.capitalName = capitalName;
    }

    //Геттеры
    public String getName() {
        return name;
    }

    public long getArea() {
        return area;
    }

    public long getPopulations() {
        return populations;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public long getCapitalPopulations() {
        return capitalPopulations;
    }

    public long getPopulationDensity() {
        return populations / area;
    }
    //СЕттеры
    public void setName(String name) {
        if (name.isEmpty()) //использовать isBlank() для проверки на строку пробелов???
            System.out.println("Название страны не может быть пустым");
        else
            this.name = name;
    }

    public void setArea(long area) {
        if(area <= 0)
            System.out.println("Площадь страны должна быть больше нуля");
        else
            this.area = area;
    }

    public void setPopulations(long populations) {
        if(populations <=0)
            System.out.println("Население должно быть больше нуля");
        else
            this.populations = populations;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public void setCapitalPopulations(long capitalPopulations) {
        this.capitalPopulations = capitalPopulations;
    }
    public void setCapitalInfo(String capitalName, long capitalPopulations) {
        this.capitalName = capitalName;
        this.capitalPopulations = capitalPopulations;
    }

    public void print(){

        System.out.println("Название: " + "\t\t\t" + name);
        System.out.println("Площадь: " + "\t\t\t" + area + " кв. км.");

        if (populations != null){
            System.out.println("Население: " + "\t\t\t" + populations + " человек");
        }
        else
            System.out.println("Население: " + "\t\t\t" + populations + " человек");

        if(capitalName != null && !capitalName.isEmpty()) {
            System.out.println("Столица: " + "\t\t\t" + capitalName);

            if (capitalPopulations != null){
                System.out.println("Население столицы: " + "\t" + capitalPopulations + " человек");
            }
            else
                System.out.println("Население столицы: " + "\t\t\t" + " неизвестно");

            System.out.println("______________________________________________________");
        }
    }
/*
//реализация метода для массива

    public static void printAll(Country[] countriesList){
        for (Country country : countriesList){
            country.print();
        }
*/
//реализация метода для ArrayList
        public static void printAllList(ArrayList<Country> countriesList2){
            for (Country country : countriesList2) {
                country.print();
            }
        }



    public static void main(String[] args) {

        Country[] countriesList=new Country[5];
        countriesList[0] = new Country("Russia", 17100000, 146700000, "Moscow", 12600000 );
        countriesList[1] = new Country("Finland", 338000, 5500000, "Helsinki", 655000 );
        countriesList[2] = new Country("France", 643800, 67800000, "Paris", 2100000 );
        countriesList[3] = new Country("Andorra", 467, 85400, "Andorra la Vella", 22600 );
        countriesList[4] = new Country("Singapore", 725, 5700000);
/*
        countriesList[0].print();
        countriesList[1].print();
        countriesList[2].print();
        countriesList[3].print();
        countriesList[4].print();
*/
        //printAll(countriesList);

// реализация через ArrayList коллекцию для простоты добавления новых значений
        ArrayList<Country> countrieslist2 = new ArrayList<Country>();
        countrieslist2.add(new Country("Russia", 17100000, 146700000, "Moscow", 12600000));
        countrieslist2.add(new Country("Finland", 338000, 5500000, "Helsinki", 655000 ));
        countrieslist2.add(new Country("France", 643800, 67800000, "Paris", 2100000 ));
        countrieslist2.add(new Country("Andorra", 467, 85400, "Andorra la Vella", 22600));
        countrieslist2.add(new Country("Singapore", 725, 5700000));
        //System.out.println(countrieslist2.toString());
        printAllList(countrieslist2);

        }
    }



