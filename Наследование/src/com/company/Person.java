package com.company;

class Car {
    private int public_y;
    private String brand;
    private String model;
    private String fueltype;
    private String condition;

    Car(int public_y, String brand, String model, String fueltype){
       this.public_y = public_y;
       this.brand = brand;
       this.model = model;
       this.fueltype = fueltype;

        if (this.public_y <= 2000){
            setCondition("new");
        }else {
            setCondition("old");
        }
    }

     int getPublic_y() {
        return public_y;
    }

     String getBrand() {
        return brand;
    }

     String getModel() {
        return model;
    }

     String getFueltype() {
        return fueltype;
    }

    public String getCondition() {
        return this.condition;
    }

    void setPublic_y(int public_y) {
    }

     void setModel(int Model){
        this.model = model;
    }

     void setBrand(String brand) {
        this.brand = brand;
    }

     void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    void setCondition(String newCondition) {
        this.condition = newCondition;
    }

    void display() {
        System.out.println("Год выпуска " +this.public_y+ ", брэнд " +this.brand+ ", модель" +this.model+ ", тип топлива" + this.fueltype + ", состояние "+ this.condition);
    }
}
