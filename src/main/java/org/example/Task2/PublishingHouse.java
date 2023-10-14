package org.example.Task2;

class PublishingHouse {
    String publishingHouseName;
    String publishingHouseCity;

    public PublishingHouse(String publishingHouseCity, String publishingHouseName){
        this.publishingHouseName = publishingHouseName;
        this.publishingHouseCity = publishingHouseCity;
    }

    public void setPublishingHouseCity(String publishingHouseCity) {
        if(publishingHouseCity.isEmpty())
            System.out.println("Должен быть задан город издательства");
        else
            this.publishingHouseCity = publishingHouseCity;
    }

    public void setPublishingHouseName(String publishingHouseName) {
        if(publishingHouseName.isEmpty())
            System.out.println("Должно быть задано название издательства");
        else
            this.publishingHouseName = publishingHouseName;
    }

    public String getPublishingHouseCity() {
        return publishingHouseCity;
    }

    public String getPublishingHouseName() {
        return publishingHouseName;
    }

    public void print(){
        System.out.print(publishingHouseName + "," + publishingHouseCity);
    }
}
