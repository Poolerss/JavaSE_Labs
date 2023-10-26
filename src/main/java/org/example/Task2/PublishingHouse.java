package org.example.Task2;


class PublishingHouse {
    String publishingHouseName;
    String publishingHouseCity;

    public PublishingHouse(String publishingHouseCity, String publishingHouseName){
		setPublishingHouseName(publishingHouseName);
		setPublishingHouseCity(publishingHouseCity);
    }

    public void setPublishingHouseCity(String publishingHouseCity) {
        if(publishingHouseCity==null || publishingHouseCity.isBlank())
            throw new IllegalArgumentException("publishingHouseCity is Empty");
        else
            this.publishingHouseCity = publishingHouseCity;
    }

    public void setPublishingHouseName(String publishingHouseName) {
        if(publishingHouseName==null ||  publishingHouseName.isBlank())
			throw new IllegalArgumentException("publishingHouseName is empty");
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

	

