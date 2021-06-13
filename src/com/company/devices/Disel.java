package com.company.devices;

public class Disel extends Car{
    public Disel(String producer, String model, Integer yearOfProduction, String color, String type, Double value) {
        super(producer, model, yearOfProduction, color, type, value);
    }
    @Override
    public void refuel() {
        System.out.println("Refuel: Disel");
    }
}
