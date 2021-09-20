package com.company;

public class Main {

    public static void main(String[] args) {
      Car car = new Car(2002, "Mersedez", "220", "бензин");
      Car car1 = new Car(2000, "Mersedez", "124", "бензин");
      Car car2 = new Car(1998, "Toyota", "Camry", "бензин");
      car.display();
      car1.display();
      car2.display();
    }
}
