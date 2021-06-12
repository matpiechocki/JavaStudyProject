package com.company.devices;

import java.util.Objects;

public class Car extends Device
{
    final String color;
    final String type;
    private Double value;

    public Car(String producer, String model, Integer yearOfProduction, String color, String type, Double value)
    {
        super(producer, model, yearOfProduction);
        this.color = color;
        this.type = type;
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("Car turnON by key");
    }


    public Double getValue(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(producer, car.producer) && Objects.equals(color, car.color) && Objects.equals(type, car.type) && Objects.equals(value, car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, color, type, value);
    }
}