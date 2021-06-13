package com.company.devices;

public class Electric extends Car{
    public Electric(String producer, String model, Integer yearOfProduction, String color, String type, Double value) {
        super(producer, model, yearOfProduction, color, type, value);
    }
    @Override
    public void refuel() {
        System.out.println("Refuel: Elecricity");
    }
}
