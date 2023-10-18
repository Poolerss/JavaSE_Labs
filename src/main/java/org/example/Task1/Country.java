package org.example.Task1;


    
    class Country {
    private String name;

    private float area;
    private Float populations; 
    private String capitalName;
    private Float capitalPopulations;

    //конструкторы
    public Country(String name, float area, float populations, String capitalName, float capitalPopulations) {
        setName(name);
        setArea(area);
        setPopulations(populations);
		     setCapitalInfo(capitalName, capitalPopulations);  
    }

    public Country(String name, float area, float populations) {
        setName(name);
        setArea(area);
        setPopulations(populations);
    }
    // только для неизвестного населения 26...36 строки
    public Country(String name, float area) {
        setName(name);
        setArea(area);
    }
    public Country(String name, float area, String capitalName, float capitalPopulations) {
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

    public float getPopulations() {
        return populations;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public float getCapitalPopulations() {
        return capitalPopulations;
    }

    public float getPopulationDensity() {
        return populations / area;
    }
    //СЕттеры
    public void setName(String name) {
        if (name.isEmpty())
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

    public void setPopulations(float populations) {
        if(populations <=0)
            throw new IllegalArgumentException("population is not correct(less than zero)");
		     else if (populations % 1!=0)
			      throw new IllegalArgumentException("population is not correct()");
        else
            this.populations = populations;
    }

	
    public void setCapitalName(String capitalName) {
		      if (capitalName.isEmpty())
			throw new IllegalArgumentException("capitalName is empty");
        else   
		this.capitalName = capitalName;
    }

    public void setCapitalPopulations(float capitalPopulations) {
        if(capitalPopulations <=0)
            throw new IllegalArgumentException("capital population is not correct(less than zero)");
		     else if (capitalPopulations % 1!=0)
			      throw new IllegalArgumentException("capital population is not correct()");
        else
            this.capitalPopulations = capitalPopulations;
    }
    public void setCapitalInfo(String capitalName, float capitalPopulations) {
        setCapitalName(capitalName);
        setCapitalPopulations(capitalPopulations);
    }

    public void print(){

        System.out.println("Название: " + "\t\t\t" + name);
        System.out.println("Площадь: " + "\t\t\t" + area + " кв. км.");
		if (populations !=null)
        System.out.println("Население: " + "\t\t\t" + populations + " человек");
		else
		System.out.println("Население: " + "\t\t\t" + "неизвестно");
        if(capitalName != null) {
            System.out.println("Столица: " + "\t\t\t" + capitalName);
			if (capitalPopulations != null)
            System.out.println("Население столицы: " + "\t\t\t" + capitalPopulations);
else
			System.out.println("Население столицы: " + "\t\t\t неизвестно");
            System.out.println("______________________________________________________");
        }
    }
public static void printAll(Country[] countriesList){
        for (Country country : countriesList){
            country.print();
        }
}
	
	public static void main(String[] args) {

        Country[] countriesList=new Country[5];
        countriesList[0] = new Country("Russia", 17100000, "Moscow" );
        countriesList[1] = new Country("Finland", 338000, 5500000, "Helsinki", 655000 );
        countriesList[2] = new Country("France", 643800, 67800000, "Paris", 2100000 );
        countriesList[3] = new Country("Andorra", 467, 85400, "Andorra la Vella", 22600 );
        countriesList[4] = new Country("Singapore", 725, 5700000);

    
        printAll(countriesList);
		
        }
}




