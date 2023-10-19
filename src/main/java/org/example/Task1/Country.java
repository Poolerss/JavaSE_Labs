package org.example.Task1;

import java.util.Arrays;

    class Country {
    private String name;
    private float area;
    private long populations;
    private String capitalName;
    private long capitalPopulations;

    //конструкторы
    public Country(String name, float area, long populations, String capitalName, long capitalPopulations) {
        setName(name);
        setArea(area);
        setPopulations(populations);
		setCapitalInfo(capitalName, capitalPopulations);
    }

    public Country(String name, float area, long populations) {
        setName(name);
        setArea(area);
        setPopulations(populations);
    }
    // только для неизвестного населения 26...36 строки
    public Country(String name, float area) {
        setName(name);
        setArea(area);
    }
    public Country(String name, float area, String capitalName, long capitalPopulations) {
        setName(name);
        setArea(area);
        setCapitalInfo(capitalName, capitalPopulations);
       
    }
    public Country(String name, long area, String capitalName) {
        setName(name);
        setArea(area);
        setCapitalName(capitalName);
        
    }

    //Геттеры
    public String getName() {
        return name;
    }

    public float getArea() {
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

    public float getPopulationDensity() {
        return (float)populations / area;
    }
    //СЕттеры
    public void setName(String name) {
        if (name.isBlank())
			throw new IllegalArgumentException("name is empty");
        else
            this.name = name;
    }

    public void setArea(float area) {
        if(area <= 0)
            throw new IllegalArgumentException("area is not correct");
        else
            this.area = area;
    }

    public void setPopulations(long populations) {
        if(populations <=0)
            throw new IllegalArgumentException("population is not correct(less than zero)");
        else
            this.populations = populations;
    }

	
    public void setCapitalName(String capitalName) {
        if (capitalName.isBlank())
			throw new IllegalArgumentException("capitalName is empty");
        else   
		    this.capitalName = capitalName;
    }

    public void setCapitalPopulations(long capitalPopulations) {
        if(capitalPopulations <=0)
            throw new IllegalArgumentException("capital population is not correct(less than zero)");
        else
            this.capitalPopulations = capitalPopulations;
    }
    public void setCapitalInfo(String capitalName, long capitalPopulations) {
        setCapitalName(capitalName);
        setCapitalPopulations(capitalPopulations);
    }

        public void print() {
            System.out.printf("Название: %s%n", name);
            System.out.printf("Площадь: %.1f кв. км.%n", area);

            if (populations != 0)
                System.out.printf("Население: %d человек%n", populations);
            else
                System.out.println("Население: неизвестно");

            if(capitalName != null) {
                System.out.printf("Столица: %s%n", capitalName);
                if (capitalPopulations != 0)
                    System.out.printf("Население столицы: %d%n", capitalPopulations);
                else
                    System.out.println("Население столицы: неизвестно");
            }
            System.out.println("______________________________________________________");
        }
        public static void printAll(Country[] countriesList) {
            if (countriesList == null || countriesList.length == 0) {
                System.out.println("Список стран пуст");
                return;
            }
            Arrays.stream(countriesList).forEach(Country::print);
        }

	
	public static void main(String[] args) {

        Country[] countriesList=new Country[5];
        countriesList[0] = new Country("Russia", 17_100_000, 146_700_000,"Moscow",12_600_000 );
        countriesList[1] = new Country("Finland", 338_000, 5_500_000, "Helsinki", 655_000 );
        countriesList[2] = new Country("France", 643_800, 67_800_000, "Paris", 2_100_000 );
        countriesList[3] = new Country("Andorra", 467, 85400, "Andorra la Vella", 22600 );
        countriesList[4] = new Country("Singapore", 725, 5_700_000);

    
        printAll(countriesList);
		
        }
}




