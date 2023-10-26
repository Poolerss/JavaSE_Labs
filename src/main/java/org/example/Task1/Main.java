package org.example.Task1;

public class Main {

         public static void main(String[] args) {

            Country[] countriesList=new Country[5];
            countriesList[0] = new Country("Russia", 17_100_000, 146_700_000,"Moscow",12_600_000 );
            countriesList[1] = new Country("Finland", 338_000, 5_500_000, "Helsinki", 655_000 );
            countriesList[2] = new Country("France", 643_800, 67_800_000, "Paris", 2_100_000 );
            countriesList[3] = new Country("Andorra", 467, 85400, "Andorra la Vella", 22600 );
            countriesList[4] = new Country("Singapore", 725, 5_700_000);

            Country.printAll(countriesList);

        }    }

